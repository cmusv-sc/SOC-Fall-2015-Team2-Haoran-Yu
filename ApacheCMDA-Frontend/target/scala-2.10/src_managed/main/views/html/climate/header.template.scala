
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
					src='"""),_display_(Seq[Any](/*29.12*/routes/*29.18*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*29.56*/("""' style="height: 40px; width: 220px;">&nbsp&nbsp<img
					src='"""),_display_(Seq[Any](/*30.12*/routes/*30.18*/.Assets.at("images/logo.png"))),format.raw/*30.47*/("""' style="height: 15px; width: 250px;"></a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<ul class="nav navbar-nav navbar-right">
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Service<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

						<li><a href=""""),_display_(Seq[Any](/*40.21*/routes/*40.27*/.ClimateServiceController.climateServices())),format.raw/*40.70*/("""">Service List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*41.21*/routes/*41.27*/.ClimateServiceController.searchClimateService())),format.raw/*41.75*/("""">Search Climate Service</a></li>
						<li><a href=""""),_display_(Seq[Any](/*42.21*/routes/*42.27*/.ClimateServiceController.mostRecentlyUsedClimateServices())),format.raw/*42.86*/("""">Mostly Used List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*43.21*/routes/*43.27*/.ClimateServiceController.mostRecentlyAddedClimateServices())),format.raw/*43.87*/("""">Mostly Added List</a></li>
					    <li><a href=""""),_display_(Seq[Any](/*44.24*/routes/*44.30*/.ClimateServiceController.mostPopularClimateServices())),format.raw/*44.84*/("""">Mostly Popular List</a></li>
						</ul>
					
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*53.21*/routes/*53.27*/.DatasetController.datasetList())),format.raw/*53.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*54.21*/routes/*54.27*/.DatasetController.searchDataset())),format.raw/*54.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*57.42*/("""
						"""),format.raw/*58.67*/("""
							"""),format.raw/*59.34*/("""
						"""),format.raw/*60.37*/("""
							"""),format.raw/*61.101*/("""
							"""),format.raw/*62.106*/("""
						"""),format.raw/*63.16*/("""
					"""),format.raw/*64.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*70.21*/routes/*70.27*/.ClimateServiceController.home())),format.raw/*70.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*71.21*/routes/*71.27*/.AboutusController.aboutUs())),format.raw/*71.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*72.21*/routes/*72.27*/.AboutusController.aboutProject())),format.raw/*72.60*/("""">About project</a></li>
						</ul>
					</li>
					
					"""),_display_(Seq[Any](/*76.7*/if(!session.get("email"))/*76.32*/ {_display_(Seq[Any](format.raw/*76.34*/("""
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*77.55*/routes/*77.61*/.Application.login())),format.raw/*77.81*/("""">
							<button type="submit" class="btn btn-success">Log in</button>
						</form>
					""")))}/*80.8*/else/*80.13*/{_display_(Seq[Any](format.raw/*80.14*/("""
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">My Services<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">My climate services</a></li>
								<li><a href="#">My datasets</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),_display_(Seq[Any](/*90.68*/session/*90.75*/.get("email"))),format.raw/*90.88*/("""<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href=""""),_display_(Seq[Any](/*92.23*/routes/*92.29*/.Application.logout())),format.raw/*92.50*/("""">Log out</a></li>
							</ul>
						</li>
					""")))})),format.raw/*95.7*/("""	
										
					"""),_display_(Seq[Any](/*97.7*/if(false)/*97.16*/ {_display_(Seq[Any](format.raw/*97.18*/("""
						<form class="navbar-form navbar-right" action="#">
							<button type="submit" class="btn btn-success">Admin Console</button>
						</form>
					""")))})),format.raw/*101.7*/("""
					
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 21:51:48 EST 2015
                    SOURCE: /Users/Tongyun/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 430dabb8b2375c4b91a82c0f0807c81a1e380873
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3874->1747|3974->1811|3989->1817|4040->1846|4423->2193|4438->2199|4503->2242|4583->2286|4598->2292|4668->2340|4758->2394|4773->2400|4854->2459|4938->2507|4953->2513|5035->2573|5123->2625|5138->2631|5214->2685|5501->2936|5516->2942|5570->2974|5650->3018|5665->3024|5721->3058|5803->3148|5838->3215|5874->3249|5909->3286|5946->3387|5983->3493|6018->3509|6052->3524|6277->3713|6292->3719|6346->3751|6418->3787|6433->3793|6483->3821|6559->3861|6574->3867|6629->3900|6724->3960|6758->3985|6798->3987|6889->4042|6904->4048|6946->4068|7056->4161|7069->4166|7108->4167|7535->4558|7551->4565|7586->4578|7704->4660|7719->4666|7762->4687|7843->4737|7897->4756|7915->4765|7955->4767|8141->4921
                    LINES: 56->18|59->18|70->29|70->29|70->29|71->30|71->30|71->30|81->40|81->40|81->40|82->41|82->41|82->41|83->42|83->42|83->42|84->43|84->43|84->43|85->44|85->44|85->44|94->53|94->53|94->53|95->54|95->54|95->54|98->57|99->58|100->59|101->60|102->61|103->62|104->63|105->64|111->70|111->70|111->70|112->71|112->71|112->71|113->72|113->72|113->72|117->76|117->76|117->76|118->77|118->77|118->77|121->80|121->80|121->80|131->90|131->90|131->90|133->92|133->92|133->92|136->95|138->97|138->97|138->97|142->101
                    -- GENERATED --
                */
            