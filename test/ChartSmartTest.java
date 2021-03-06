
import org.approvaltests.Approvals;
import org.approvaltests.reporters.DelayedClipboardReporter;
import org.approvaltests.reporters.UseReporter;

import junit.framework.TestCase;

@UseReporter(DelayedClipboardReporter.class)
public class ChartSmartTest extends TestCase
{
  public void testMainWindow() throws Exception
  {
    ChartSmart chartSmart = new ChartSmart();
    Approvals.verify(chartSmart);
  }
  public void testBarChartWindow() throws Exception
  {
    ChartWindow chartSmart = new ChartWindow();
    chartSmart.iniDS(406, "rpfll", true);
    Approvals.verify(chartSmart);
    assertEquals("Bar Chart - Single Mode", chartSmart.getTitle());
  }
  public void testPieChartWindow() throws Exception
  {
    ChartWindow chartSmart = new ChartWindow();
    chartSmart.iniDS(323, "rpfll", true);
    Approvals.verify(chartSmart);
    assertEquals("Pie Chart - Single Mode", chartSmart.getTitle());
  }
  public void testBarChartSmallWindow() throws Exception
  {
    ChartWindow chartSmart = new ChartWindow();
    chartSmart.iniDS(406, "shareddisplay", true);
    Approvals.verify(chartSmart);
    assertEquals("Bar Chart - Compare Mode", chartSmart.getTitle());
  }
  public void testPieChartSmallWindow() throws Exception
  {
    ChartWindow chartSmart = new ChartWindow();
    chartSmart.iniDS(323, "shareddisplay", true);
    Approvals.verify(chartSmart);
    assertEquals("Pie Chart - Compare Mode", chartSmart.getTitle());
  }
}