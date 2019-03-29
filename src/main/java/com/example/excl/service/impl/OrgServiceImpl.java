package com.example.excl.service.impl;

import com.example.excl.domain.Node;
import com.example.excl.domain.Org;
import com.example.excl.mapper.SspOrgMapper;
import com.example.excl.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanjunshuang on 2018/12/14.
 */
@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    SspOrgMapper sspOrgMapper;

    @Override
    public Node getTree(String orgUuid) {
        List<Org> orgs = sspOrgMapper.getTopAgent1Org(orgUuid);
        List<Node> nodes = new ArrayList<>();
        // org 的list 转成node
        for(Org org : orgs){
            Node n = converFromOrg(org);
            nodes.add(n);
        }
        Node treeNode = new Node();
        int maxDepth=0;
        for(Node node : nodes) {
            if (node.getNodeId().equals(orgUuid)) { // 找到根节点
                treeNode = node;
            } else {
                for (Node n : nodes) { // 找子节点的父节点
                    if (node.getParent_id().equals(n.getNodeId())) {
                        node.setDepth(n.getDepth() + 1);
                        treeNode.getSonNodeList().add(node);
                        maxDepth = maxDepth > node.getDepth() ? maxDepth : node.getDepth();
                    }
                }
            }
        }
        treeNode.setMaxDepth(maxDepth);
        return treeNode;
    }

    // 转换 由org 转 Node
    public Node converFromOrg(Org org){
        Node node = new Node();
        node.setNodeId(org.getOrgUuid());
        node.setNodeName(org.getOrgNm());
        node.setParent_id(org.getParentOrg());
        node.setSonNodeList(new ArrayList<Node>());
        node.setDepth(0);
        return node;
    }

}
