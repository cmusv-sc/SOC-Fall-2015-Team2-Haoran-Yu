
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
						<li><a href=""""),_display_(Seq[Any](/*41.21*/routes/*41.27*/.ClimateServiceController.mostRecentlyUsedClimateServices())),format.raw/*41.86*/("""">Mostly Used List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*42.21*/routes/*42.27*/.ClimateServiceController.mostRecentlyAddedClimateServices())),format.raw/*42.87*/("""">Mostly Added List</a></li>
					    <li><a href=""""),_display_(Seq[Any](/*43.24*/routes/*43.30*/.ClimateServiceController.mostPopularClimateServices())),format.raw/*43.84*/("""">Mostly Popular List</a></li>
						</ul>
					
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*52.21*/routes/*52.27*/.DatasetController.datasetList())),format.raw/*52.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*53.21*/routes/*53.27*/.DatasetController.searchDataset())),format.raw/*53.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*56.42*/("""
						"""),format.raw/*57.67*/("""
							"""),format.raw/*58.34*/("""
						"""),format.raw/*59.37*/("""
							"""),format.raw/*60.101*/("""
							"""),format.raw/*61.106*/("""
						"""),format.raw/*62.16*/("""
					"""),format.raw/*63.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*69.21*/routes/*69.27*/.ClimateServiceController.home())),format.raw/*69.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*70.21*/routes/*70.27*/.AboutusController.aboutUs())),format.raw/*70.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*71.21*/routes/*71.27*/.AboutusController.aboutProject())),format.raw/*71.60*/("""">About project</a></li>
						</ul>
					</li>
					
					"""),_display_(Seq[Any](/*75.7*/if(!session.get("email"))/*75.32*/ {_display_(Seq[Any](format.raw/*75.34*/("""
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*76.55*/routes/*76.61*/.Application.login())),format.raw/*76.81*/("""">
							<button type="submit" class="btn btn-success">Log in</button>
						</form>
					""")))}/*79.8*/else/*79.13*/{_display_(Seq[Any](format.raw/*79.14*/("""
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">My Services<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">My climate services</a></li>
								<li><a href="#">My datasets</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),_display_(Seq[Any](/*89.68*/session/*89.75*/.get("email"))),format.raw/*89.88*/("""<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href=""""),_display_(Seq[Any](/*91.23*/routes/*91.29*/.Application.logout())),format.raw/*91.50*/("""">Log out</a></li>
							</ul>
						</li>
					""")))})),format.raw/*94.7*/("""	
										
					"""),_display_(Seq[Any](/*96.7*/if(false)/*96.16*/ {_display_(Seq[Any](format.raw/*96.18*/("""
						<form class="navbar-form navbar-right" action="#">
							<button type="submit" class="btn btn-success">Admin Console</button>
						</form>
					""")))})),format.raw/*100.7*/("""
					
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
                    DATE: Wed Nov 18 20:09:44 EST 2015
                    SOURCE: /Users/Tongyun/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: e8e79426d6f27f54088992d41529ee270ba2c869
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3874->1747|3974->1811|3989->1817|4040->1846|4423->2193|4438->2199|4503->2242|4583->2286|4598->2292|4679->2351|4763->2399|4778->2405|4860->2465|4948->2517|4963->2523|5039->2577|5326->2828|5341->2834|5395->2866|5475->2910|5490->2916|5546->2950|5628->3040|5663->3107|5699->3141|5734->3178|5771->3279|5808->3385|5843->3401|5877->3416|6102->3605|6117->3611|6171->3643|6243->3679|6258->3685|6308->3713|6384->3753|6399->3759|6454->3792|6549->3852|6583->3877|6623->3879|6714->3934|6729->3940|6771->3960|6881->4053|6894->4058|6933->4059|7360->4450|7376->4457|7411->4470|7529->4552|7544->4558|7587->4579|7668->4629|7722->4648|7740->4657|7780->4659|7966->4813
                    LINES: 56->18|59->18|70->29|70->29|70->29|71->30|71->30|71->30|81->40|81->40|81->40|82->41|82->41|82->41|83->42|83->42|83->42|84->43|84->43|84->43|93->52|93->52|93->52|94->53|94->53|94->53|97->56|98->57|99->58|100->59|101->60|102->61|103->62|104->63|110->69|110->69|110->69|111->70|111->70|111->70|112->71|112->71|112->71|116->75|116->75|116->75|117->76|117->76|117->76|120->79|120->79|120->79|130->89|130->89|130->89|132->91|132->91|132->91|135->94|137->96|137->96|137->96|141->100
                    -- GENERATED --
                */
            