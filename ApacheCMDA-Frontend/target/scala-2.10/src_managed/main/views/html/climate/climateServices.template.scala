
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
object climateServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServices: List[metadata.ClimateService], climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""

	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.111*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services", scripts)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Climate Services</h1>
    <h2><a href='"""),_display_(Seq[Any](/*36.19*/routes/*36.25*/.Application.comment())),format.raw/*36.47*/("""'>Comment and Rate</a></h2>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
		<thead>
	<tr>
		<th class="col-md-2">Climate Service Name</td>
		<th class="col-md-4">Purpose</td>
		<th class="col-md-2">Url</td>
		<th class="col-md-1">Rate</td>
	</tr>
	</thead>
	"""),_display_(Seq[Any](/*46.3*/for(climateService <- climateServices) yield /*46.41*/{_display_(Seq[Any](format.raw/*46.42*/("""
	<tr>
		<td><a href = """"),_display_(Seq[Any](/*48.19*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*48.88*/(""""><font size="3">"""),_display_(Seq[Any](/*48.106*/climateService/*48.120*/.getClimateServiceName())),format.raw/*48.144*/("""</a></font></td>

		<td><span class=""""),_display_(Seq[Any](/*50.21*/climateService/*50.35*/.getClimateServiceName())),format.raw/*50.59*/(""" editable"  data-name='purpose'><font size="3">
				"""),_display_(Seq[Any](/*51.6*/climateService/*51.20*/.getPurpose())),format.raw/*51.33*/(""" </font></span></td>
		
		<td class = "text-center" ><span class=""""),_display_(Seq[Any](/*53.44*/climateService/*53.58*/.getClimateServiceName())),format.raw/*53.82*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*54.17*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*54.86*/(""""><img src='"""),_display_(Seq[Any](/*54.99*/climateService/*54.113*/.getPhoto())),format.raw/*54.124*/("""' style="height: 150px; width: 150px" ></a> </span></td>
	    <td><span class=""""),_display_(Seq[Any](/*55.24*/climateService/*55.38*/.getClimateServiceName())),format.raw/*55.62*/(""" editable" id = "rate" data-name='rate'><font size="3">"""),_display_(Seq[Any](/*55.118*/climateService/*55.132*/.getRate())),format.raw/*55.142*/(""" </font></span></td>
	</tr>
	""")))})),format.raw/*57.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*61.7*/if(false)/*61.16*/{_display_(Seq[Any](format.raw/*61.17*/("""
		    
	    """),_display_(Seq[Any](/*63.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*63.115*/ {_display_(Seq[Any](format.raw/*63.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*66.7*/("""
    """)))})),format.raw/*67.6*/("""
""")))})),format.raw/*68.2*/("""
"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 01:02:06 EST 2015
                    SOURCE: /Users/Tongyun/Desktop/SOC-Fall-2015-master/ApacheCMDA-Frontend/app/views/climate/climateServices.scala.html
                    HASH: 27f8b1f22a66bed2dd935276c229abc247e5f9b8
                    MATRIX: 3250->1205|3453->1335|3468->1342|3553->1346|3605->1362|3620->1368|3682->1408|3784->1482|3813->1483|3843->1486|3871->1487|3927->1314|3956->1333|3984->1502|4022->1505|4064->1538|4104->1540|4144->1545|4181->1560|4233->1576|4257->1591|4286->1598|4363->1639|4378->1645|4422->1667|4770->1980|4824->2018|4863->2019|4924->2044|5015->2113|5070->2131|5094->2145|5141->2169|5215->2207|5238->2221|5284->2245|5372->2298|5395->2312|5430->2325|5533->2392|5556->2406|5602->2430|5693->2485|5784->2554|5833->2567|5857->2581|5891->2592|6007->2672|6030->2686|6076->2710|6169->2766|6193->2780|6226->2790|6287->2820|6349->2847|6367->2856|6406->2857|6455->2871|6573->2979|6614->2981|6734->3070|6771->3076|6804->3078
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|79->36|79->36|79->36|89->46|89->46|89->46|91->48|91->48|91->48|91->48|91->48|93->50|93->50|93->50|94->51|94->51|94->51|96->53|96->53|96->53|97->54|97->54|97->54|97->54|97->54|98->55|98->55|98->55|98->55|98->55|98->55|100->57|104->61|104->61|104->61|106->63|106->63|106->63|109->66|110->67|111->68
                    -- GENERATED --
                */
            