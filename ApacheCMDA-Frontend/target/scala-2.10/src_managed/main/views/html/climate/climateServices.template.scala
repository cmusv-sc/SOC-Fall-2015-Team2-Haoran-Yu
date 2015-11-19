
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
object climateServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[List[metadata.ClimateService]],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
    def apply/*17.2*/(climateServices: List[List[metadata.ClimateService]], climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
	<script src='"""),_display_(Seq[Any](/*22.16*/routes/*22.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*24.30*/("""{"""),format.raw/*24.31*/("""

	"""),format.raw/*26.2*/("""}"""),format.raw/*26.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*17.117*/("""

"""),format.raw/*20.1*/("""
"""),format.raw/*28.2*/("""

"""),_display_(Seq[Any](/*30.2*/main("Climate Services", scripts)/*30.35*/ {_display_(Seq[Any](format.raw/*30.37*/("""
	
	"""),_display_(Seq[Any](/*32.3*/flash_message())),format.raw/*32.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*34.10*/climateServices/*34.25*/.size())),format.raw/*34.32*/(""" Climate Services</h1>
    <h2><a href='"""),_display_(Seq[Any](/*35.19*/routes/*35.25*/.Application.comment())),format.raw/*35.47*/("""'>Comment and Rate</a></h2>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
		<thead>
	<tr>
		<th class="col-md-2">Climate Service Name</td>
		<th class="col-md-4">Purpose</td>
		<th class="col-md-2">Url</td>
		<th class="col-md-1">Rate</td>
		<th class="col-md-2">Version</td>
	</tr>
	</thead>


    """),_display_(Seq[Any](/*48.6*/for(climateServiceList <- climateServices) yield /*48.48*/{_display_(Seq[Any](format.raw/*48.49*/("""
	<tr>

		<td><font size="3">"""),_display_(Seq[Any](/*51.23*/climateServiceList/*51.41*/.get(0).getClimateServiceName())),format.raw/*51.72*/("""</font></td>

		<td><span class=""""),_display_(Seq[Any](/*53.21*/climateServiceList/*53.39*/.get(0).getClimateServiceName())),format.raw/*53.70*/(""" editable"  data-name='purpose'><font size="3">
				"""),_display_(Seq[Any](/*54.6*/climateServiceList/*54.24*/.get(0).getPurpose())),format.raw/*54.44*/(""" </font></span></td>
		
		<td class = "text-center" ><span class=""""),_display_(Seq[Any](/*56.44*/climateServiceList/*56.62*/.get(0).getClimateServiceName())),format.raw/*56.93*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*57.17*/{routes.ClimateServiceController.oneService(climateServiceList.get(0).getUrl())})),format.raw/*57.97*/(""""><img src='"""),_display_(Seq[Any](/*57.110*/climateServiceList/*57.128*/.get(0).getPhoto())),format.raw/*57.146*/("""' style="height: 150px; width: 150px" ></a> </span></td>

		<td><span class=""""),_display_(Seq[Any](/*59.21*/climateServiceList/*59.39*/.get(climateServiceList.size()-1).getClimateServiceName())),format.raw/*59.96*/(""" editable" id = "rate" data-name='rate'><font size="3">"""),_display_(Seq[Any](/*59.152*/climateServiceList/*59.170*/.get(climateServiceList.size()-1).getAllRates())),format.raw/*59.217*/("""</font></span></td>

		<td>
			"""),_display_(Seq[Any](/*62.5*/for(service <- climateServiceList) yield /*62.39*/ {_display_(Seq[Any](format.raw/*62.41*/("""
			<a href = """"),_display_(Seq[Any](/*63.16*/{routes.ClimateServiceController.oneService(service.getUrl())})),format.raw/*63.78*/(""""><font size="3">"""),_display_(Seq[Any](/*63.96*/service/*63.103*/.getVersion())),format.raw/*63.116*/("""</a></font>
			""")))})),format.raw/*64.5*/("""
		</td>
	
	</tr>
	""")))})),format.raw/*68.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*72.7*/if(false)/*72.16*/{_display_(Seq[Any](format.raw/*72.17*/("""
		    
	    """),_display_(Seq[Any](/*74.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*74.115*/ {_display_(Seq[Any](format.raw/*74.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*77.7*/("""
    """)))})),format.raw/*78.6*/("""
""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(climateServices:List[List[metadata.ClimateService]],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[List[metadata.ClimateService]],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 22:05:22 EST 2015
                    SOURCE: /Users/Tongyun/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/climateServices.scala.html
                    HASH: 65f35b5d00c8eb8490edf9086f5540c4ad7d0954
                    MATRIX: 3256->1204|3465->1340|3480->1347|3565->1351|3617->1367|3632->1373|3694->1413|3796->1487|3825->1488|3855->1491|3883->1492|3939->1319|3968->1338|3996->1507|4034->1510|4076->1543|4116->1545|4156->1550|4193->1565|4245->1581|4269->1596|4298->1603|4375->1644|4390->1650|4434->1672|4823->2026|4881->2068|4920->2069|4986->2099|5013->2117|5066->2148|5136->2182|5163->2200|5216->2231|5304->2284|5331->2302|5373->2322|5476->2389|5503->2407|5556->2438|5647->2493|5749->2573|5799->2586|5827->2604|5868->2622|5982->2700|6009->2718|6088->2775|6181->2831|6209->2849|6279->2896|6346->2928|6396->2962|6436->2964|6488->2980|6572->3042|6626->3060|6643->3067|6679->3080|6726->3096|6777->3116|6839->3143|6857->3152|6896->3153|6945->3167|7063->3275|7104->3277|7224->3366|7261->3372|7294->3374
                    LINES: 56->17|59->21|59->21|61->21|62->22|62->22|62->22|64->24|64->24|66->26|66->26|69->17|71->20|72->28|74->30|74->30|74->30|76->32|76->32|78->34|78->34|78->34|79->35|79->35|79->35|92->48|92->48|92->48|95->51|95->51|95->51|97->53|97->53|97->53|98->54|98->54|98->54|100->56|100->56|100->56|101->57|101->57|101->57|101->57|101->57|103->59|103->59|103->59|103->59|103->59|103->59|106->62|106->62|106->62|107->63|107->63|107->63|107->63|107->63|108->64|112->68|116->72|116->72|116->72|118->74|118->74|118->74|121->77|122->78|123->79
                    -- GENERATED --
                */
            