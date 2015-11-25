
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
object climateServiceList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[List[metadata.ClimateService]],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServices: List[List[metadata.ClimateService]], climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
		//alert($("#url").text());
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.117*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services", scripts)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Climate Services</h1>
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
	"""),_display_(Seq[Any](/*46.3*/for(climateServiceList <- climateServices) yield /*46.45*/{_display_(Seq[Any](format.raw/*46.46*/("""
	<tr>
		<td><font size="3">"""),_display_(Seq[Any](/*48.23*/climateServiceList/*48.41*/.get(0).getClimateServiceName())),format.raw/*48.72*/("""</font></td>

		<td><span class=""""),_display_(Seq[Any](/*50.21*/climateServiceList/*50.39*/.get(0).getClimateServiceName())),format.raw/*50.70*/(""" editable"  data-name='purpose'><font size="3">
				"""),_display_(Seq[Any](/*51.6*/climateServiceList/*51.24*/.get(0).getPurpose())),format.raw/*51.44*/(""" </font></span></td>
		
		<td class = "text-center" ><span class=""""),_display_(Seq[Any](/*53.44*/climateServiceList/*53.62*/.get(0).getClimateServiceName())),format.raw/*53.93*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*54.17*/{routes.ClimateServiceController.oneService(climateServiceList.get(0).getUrl())})),format.raw/*54.97*/(""""><img src='"""),_display_(Seq[Any](/*54.110*/climateServiceList/*54.128*/.get(0).getPhoto())),format.raw/*54.146*/("""' style="height: 150px; width: 150px" ></a > </span></td>
        
		<td><span class=""""),_display_(Seq[Any](/*56.21*/climateServiceList/*56.39*/.get(climateServiceList.size()-1).getClimateServiceName())),format.raw/*56.96*/(""" editable" id = "rate" data-name='rate'><font size="3">"""),_display_(Seq[Any](/*56.152*/climateServiceList/*56.170*/.get(climateServiceList.size()-1).getAllRates())),format.raw/*56.217*/("""</font></span></td>
		<td>
			"""),_display_(Seq[Any](/*58.5*/for(service <- climateServiceList) yield /*58.39*/ {_display_(Seq[Any](format.raw/*58.41*/("""
			<a href = """"),_display_(Seq[Any](/*59.16*/{routes.ClimateServiceController.oneService(service.getUrl())})),format.raw/*59.78*/(""""><font size="3">"""),_display_(Seq[Any](/*59.96*/service/*59.103*/.getVersion())),format.raw/*59.116*/("""</a ></font>
			""")))})),format.raw/*60.5*/("""
		</td>

	
	</tr>
	""")))})),format.raw/*65.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*69.7*/if(false)/*69.16*/{_display_(Seq[Any](format.raw/*69.17*/("""
		    
	    """),_display_(Seq[Any](/*71.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*71.115*/ {_display_(Seq[Any](format.raw/*71.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*74.7*/("""
    """)))})),format.raw/*75.6*/("""
""")))})))}
    }
    
    def render(climateServices:List[List[metadata.ClimateService]],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[List[metadata.ClimateService]],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 24 21:21:28 EST 2015
                    SOURCE: /Users/Tongyun/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/climateServiceList.scala.html
                    HASH: 581348ca3b57507cd397914a3854d652fb44cb35
                    MATRIX: 3259->1205|3468->1341|3483->1348|3568->1352|3620->1368|3635->1374|3697->1414|3799->1488|3828->1489|3886->1520|3914->1521|3970->1320|3999->1339|4027->1536|4065->1539|4107->1572|4147->1574|4187->1579|4224->1594|4276->1610|4300->1625|4329->1632|4708->1976|4766->2018|4805->2019|4870->2048|4897->2066|4950->2097|5020->2131|5047->2149|5100->2180|5188->2233|5215->2251|5257->2271|5360->2338|5387->2356|5440->2387|5531->2442|5633->2522|5683->2535|5711->2553|5752->2571|5875->2658|5902->2676|5981->2733|6074->2789|6102->2807|6172->2854|6238->2885|6288->2919|6328->2921|6380->2937|6464->2999|6518->3017|6535->3024|6571->3037|6619->3054|6671->3075|6733->3102|6751->3111|6790->3112|6839->3126|6957->3234|6998->3236|7118->3325|7155->3331
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|89->46|89->46|89->46|91->48|91->48|91->48|93->50|93->50|93->50|94->51|94->51|94->51|96->53|96->53|96->53|97->54|97->54|97->54|97->54|97->54|99->56|99->56|99->56|99->56|99->56|99->56|101->58|101->58|101->58|102->59|102->59|102->59|102->59|102->59|103->60|108->65|112->69|112->69|112->69|114->71|114->71|114->71|117->74|118->75
                    -- GENERATED --
                */
            