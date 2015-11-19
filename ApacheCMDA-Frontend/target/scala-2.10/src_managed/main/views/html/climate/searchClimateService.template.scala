
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
object searchClimateService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
	<script type="text/javascript">
	$(function() """),format.raw/*28.15*/("""{"""),format.raw/*28.16*/("""
	    var availableServiceNames = [
	                "2-D-Variable-Map",
					"2-D-Variable-Zonal-Mean",
					"2-D-Variable-Time-Series",
					"3-D-Variable-2-D-Slice",
					"3-D-Variable-Zonal-Mean",
					"3-D-Variable-Average-Vertical-Profile",
					"Scatter-and-Histogram-Plot-of-Two-Variables",
					"Difference-Plot-of-Two-Time-Averaged-Variables",
					"Conditional-Sampling-with-One-Variable",
					"Conditional-Sampling-with-Two-Variables",
					"Time-Lagged-Correlation-Map-of-Two-Variables",
					"Regrid-and-Download"];

			$("#serviceName").autocomplete("""),format.raw/*43.35*/("""{"""),format.raw/*43.36*/("""
				source : availableServiceNames
			"""),format.raw/*45.4*/("""}"""),format.raw/*45.5*/(""");
		"""),format.raw/*46.3*/("""}"""),format.raw/*46.4*/(""");

		
	</script>
""")))};
Seq[Any](format.raw/*18.63*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*50.2*/("""

"""),_display_(Seq[Any](/*52.2*/main("Search Climate Service", scripts)/*52.41*/{_display_(Seq[Any](format.raw/*52.42*/("""
	
	"""),_display_(Seq[Any](/*54.3*/flash_message())),format.raw/*54.18*/("""   
	 
    <h1 style="margin-left:490px">Search Climate Service</h1>
    """),_display_(Seq[Any](/*57.6*/helper/*57.12*/.form(routes.ClimateServiceController.getSearchResult())/*57.68*/ {_display_(Seq[Any](format.raw/*57.70*/("""
    	<div class="ui-widget col-sm-offset-3 col-sm-7">
    	<div class = "form-group">
    		"""),_display_(Seq[Any](/*60.8*/inputText(climateServiceForm("Service Name"), 'class -> "form-control", 'id -> "serviceName", '_label -> Messages("Service Name"), 'placeholder -> "2-D-Variable-Map", 'size->70))),format.raw/*60.185*/(""" 
    	</div>
	    	
	    	<div id="show" style="display: none;">
	    		<textarea style="width: 640px" rows="4" id="content"></textarea>
	    	</div>

	    <div align="center">
	    	
	    	<input class="btn" type="submit" value="Search">
	    </div>
	    </div>
	    
	    """)))})),format.raw/*73.7*/("""
	 """)))})))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm)
    
    def f:((play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 21:51:48 EST 2015
                    SOURCE: /Users/Tongyun/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/searchClimateService.scala.html
                    HASH: 24c543d325a431ab6455b9f0293a40dc555aab9a
                    MATRIX: 3225->1205|3380->1287|3395->1294|3480->1298|3532->1314|3547->1320|3609->1360|3916->1639|3945->1640|4539->2206|4568->2207|4634->2246|4662->2247|4694->2252|4722->2253|4781->1266|4810->1285|4838->2272|4876->2275|4924->2314|4963->2315|5003->2320|5040->2335|5149->2409|5164->2415|5229->2471|5269->2473|5398->2567|5598->2744|5905->3020
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|67->28|67->28|82->43|82->43|84->45|84->45|85->46|85->46|90->18|92->21|93->50|95->52|95->52|95->52|97->54|97->54|100->57|100->57|100->57|100->57|103->60|103->60|116->73
                    -- GENERATED --
                */
            