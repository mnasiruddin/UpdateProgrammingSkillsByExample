package learnbyexample.grafana;

import com.appnexus.grafana.client.GrafanaClient;
import com.appnexus.grafana.client.models.Dashboard;
import com.appnexus.grafana.client.models.DashboardMeta;
import com.appnexus.grafana.client.models.DashboardPanel;
import com.appnexus.grafana.client.models.DashboardPanelTarget;
import com.appnexus.grafana.client.models.DashboardPanelXAxis;
import com.appnexus.grafana.client.models.DashboardPanelYAxis;
import com.appnexus.grafana.client.models.DashboardRow;
import com.appnexus.grafana.client.models.GrafanaDashboard;
import com.appnexus.grafana.configuration.GrafanaConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UploadData {

    public static void main(String[] args) throws Exception {
        GrafanaConfiguration gc = new GrafanaConfiguration();
        gc.host("http://localhost:3000").apiKey("Bearer eyJrIjoiSlA2Ym15M2NaVTBaVUVTSmh2aGYzR2c5bUFOQVJTSm4iLCJuIjoiQWRtaW4iLCJpZCI6MX0=");
        GrafanaClient grafanaClient = new GrafanaClient(gc);

        //Setup the dashboard
        String dashboardName = "new_dashboard";

        DashboardPanelTarget dashboardPanelTarget =
                new DashboardPanelTarget().refId("getSomeMetric").target("*");

        DashboardPanelXAxis dashboardPanelXAxis =
                new DashboardPanelXAxis().show(true).mode(DashboardPanelXAxis.Mode.TIME);

        DashboardPanelYAxis dashboardPanelYAxis =
                new DashboardPanelYAxis().format(DashboardPanelYAxis.Format.SHORT).logBase(1).show(true);

        DashboardPanel dashboardPanel =
                new DashboardPanel()
                        .targets(new ArrayList<>(Collections.singletonList(dashboardPanelTarget)))
                        .datasource("string")
                        .type(DashboardPanel.Type.GRAPH)
                        .fill(1)
                        .title(dashboardName)
                        .linewidth(1)
                        .lines(true)
                        .height("300px")
                        .span(12)
                        .xaxis(dashboardPanelXAxis)
                        .yaxes(new ArrayList<>(Arrays.asList(dashboardPanelYAxis, dashboardPanelYAxis)));

        DashboardRow dashboardRow =
                new DashboardRow()
                        .collapse(false)
                        .panels(new ArrayList<>(Collections.singletonList(dashboardPanel)));

        Dashboard dashboard =
                new Dashboard()
                        .title(dashboardName)
                        .schemaVersion(1)
                        .rows(new ArrayList<>(Collections.singletonList(dashboardRow)));

        DashboardMeta dashboardMeta = new DashboardMeta().canSave(true).slug(dashboardName);

        GrafanaDashboard grafanaDashboard =
                new GrafanaDashboard().meta(dashboardMeta).dashboard(dashboard);

        //Make API calls
        grafanaClient.createDashboard(grafanaDashboard);

        grafanaClient.getDashboard(dashboardName);
    }
}
