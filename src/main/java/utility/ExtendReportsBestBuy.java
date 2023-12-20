package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsBestBuy {
           public static ExtentReports getReport() {
        	   ExtentSparkReporter report=new ExtentSparkReporter("./bestbuyreports/report.html");
        	   report.config().setReportName("BestBuy Reporter");
        	   report.config().setDocumentTitle("BestBuy Reporter Title");
        	   ExtentReports extent=new ExtentReports();
        	   extent.attachReporter(report);
        	   
        	   return extent;
        	   
        	   }
}
