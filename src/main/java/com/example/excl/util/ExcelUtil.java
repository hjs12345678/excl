package com.example.excl.util;

import com.example.excl.domain.Node;
import com.example.excl.service.OrgService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hanjunshuang on 2018/12/14.
 */
@Component
public class ExcelUtil {

    @Autowired
    private OrgService orgService;

    public void getHSSFWorkbook(String orgUuid, HttpServletResponse response) {

        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();

        // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet("机构导出");

        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row = sheet.createRow(0);

        //声明列对象
        HSSFCell cell = null;

        Node nodeColum = orgService.getTree(orgUuid);
        //创建标题
        for (int i = 0; i <= nodeColum.getMaxDepth(); i++) {
            cell = row.createCell(i);
            if (i == 0) {
                cell.setCellValue("父级");
            }else{
                cell.setCellValue("子" + i + "级");
            }
        }

        //创建内容
        row = sheet.createRow(1);
        cell = row.createCell(nodeColum.getDepth());
        cell.setCellValue(nodeColum.getNodeName());
        insert(nodeColum, sheet, 1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String filename = "机构导出" + df.format(new Date()) + ".xlsx";
        OutputStream output= null;
        try {
            filename = new String(filename.getBytes(), "ISO8859-1");
            output = response.getOutputStream();
            response.reset();
            response.setHeader("Content-disposition", "attachment;filename=" + filename);
            response.setContentType("application/x-msdownload");
            wb.write(output);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 插入数据
    private int max = 0;
    public void insert(Node node, HSSFSheet sheet, int step) {
        for (Node n : node.getSonNodeList()) {
            step += 1; // 有一个子节点就+1——第几行
            HSSFRow row = sheet.createRow(step);// 创建行
            HSSFCell cell = row.createCell(n.getDepth());//创建这个子节点对应级数得单元格
            cell.setCellValue(n.getNodeName());// 插入内容
            max = step; // 记录
            insert(n, sheet, step); // 子节点还有子节点就递归
            step = max>step?max:step; // 插入了该子节点所有得子节点后要返回该叶子得行数 供该子节点得兄弟用
        }
    }

}

