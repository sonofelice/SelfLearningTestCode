package mm_test;

import java.io.IOException;
import java.io.OutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 * 到处数据到 excel 表格的工具类
 * 
 * @Date: 2016年4月20日 下午2:02:59
 *
 * @author zhangmengmeng01@baidu.com
 */
public class SimpleExcelWrite {
    public void createExcel(OutputStream os) throws WriteException,IOException{
        WritableWorkbook workbook = Workbook.createWorkbook(os);
        WritableSheet sheet = workbook.createSheet("First sheet", 0);
        Label xuexiao = new Label(0,0,"学校");
        sheet.addCell(xuexiao);
        Label zhuanye = new Label(1,0,"专业");
        sheet.addCell(zhuanye);
        Label jingzhengli = new Label(2,0,"专业竞争力");
        sheet.addCell(jingzhengli);
        
        Label qinghua = new Label(0,1,"清华大学");
        sheet.addCell(qinghua);
        Label jisuanji = new Label(1,1,"计算机专业");
        sheet.addCell(jisuanji);
        Label gao = new Label(2,1,"高");
        sheet.addCell(gao);
        
        Label beida = new Label(0,2,"北京大学");
        sheet.addCell(beida);
        Label falv = new Label(1,2,"法律专业");
        sheet.addCell(falv);
        Label zhong = new Label(2,2,"中");
        sheet.addCell(zhong);
        
        Label ligong = new Label(0,3,"北京理工大学");
        sheet.addCell(ligong);
        Label hangkong = new Label(1,3,"航空专业");
        sheet.addCell(hangkong);
        Label di = new Label(2,3,"低");
        sheet.addCell(di);
        //把创建的内容写入到输出流中，并关闭输出流
        workbook.write();
        workbook.close();
        os.close();
    }
}
