package com.example.excl.domain;

import java.util.List;
import java.util.Map;

/**
 * Created by hanjunshuang on 2018/12/14.
 */
public class Node {
    private String parent_id;
    private String nodeId;
    private Node parent_node;
    private String nodeName;
    private int depth;
    private List<Node> sonNodeList;

    // 所在树的最大深度 只用于根节点
    private int maxDepth;

    public List<Node> getSonNodeList() {
        return sonNodeList;
    }

    public void setSonNodeList(List<Node> sonNodeList) {
        this.sonNodeList = sonNodeList;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Node getParent_node() {
        return parent_node;
    }

    public void setParent_node(Node parent_node) {
        this.parent_node = parent_node;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }


}
