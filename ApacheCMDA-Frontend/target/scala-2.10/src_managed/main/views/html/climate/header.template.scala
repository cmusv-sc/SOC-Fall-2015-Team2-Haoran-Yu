
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
					
						</ul>
					
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*50.21*/routes/*50.27*/.DatasetController.datasetList())),format.raw/*50.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*51.21*/routes/*51.27*/.DatasetController.searchDataset())),format.raw/*51.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*54.42*/("""
						"""),format.raw/*55.67*/("""
							"""),format.raw/*56.34*/("""
						"""),format.raw/*57.37*/("""
							"""),format.raw/*58.101*/("""
							"""),format.raw/*59.106*/("""
						"""),format.raw/*60.16*/("""
					"""),format.raw/*61.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*67.21*/routes/*67.27*/.ClimateServiceController.home())),format.raw/*67.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*68.21*/routes/*68.27*/.AboutusController.aboutUs())),format.raw/*68.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*69.21*/routes/*69.27*/.AboutusController.aboutProject())),format.raw/*69.60*/("""">About project</a></li>
						</ul>
					</li>
					
					"""),_display_(Seq[Any](/*73.7*/if(!session.get("email"))/*73.32*/ {_display_(Seq[Any](format.raw/*73.34*/("""
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*74.55*/routes/*74.61*/.Application.login())),format.raw/*74.81*/("""">
							<button type="submit" class="btn btn-success">Log in</button>
						</form>
					""")))}/*77.8*/else/*77.13*/{_display_(Seq[Any](format.raw/*77.14*/("""
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">My Services<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">My climate services</a></li>
								<li><a href="#">My datasets</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),_display_(Seq[Any](/*87.68*/session/*87.75*/.get("email"))),format.raw/*87.88*/("""<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href=""""),_display_(Seq[Any](/*89.23*/routes/*89.29*/.Application.logout())),format.raw/*89.50*/("""">Log out</a></li>
							</ul>
						</li>
					""")))})),format.raw/*92.7*/("""	
										
					"""),_display_(Seq[Any](/*94.7*/if(false)/*94.16*/ {_display_(Seq[Any](format.raw/*94.18*/("""
						<form class="navbar-form navbar-right" action="#">
							<button type="submit" class="btn btn-success">Admin Console</button>
						</form>
					""")))})),format.raw/*98.7*/("""
					
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
                    DATE: Tue Nov 17 21:57:03 EST 2015
                    SOURCE: /Users/Tongyun/Desktop/SOC-Fall-2015-master/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 1540834829467c73c6a65fcfa0560b8c2247fc8e
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3874->1747|3974->1811|3989->1817|4040->1846|4423->2193|4438->2199|4503->2242|4789->2492|4804->2498|4858->2530|4938->2574|4953->2580|5009->2614|5091->2704|5126->2771|5162->2805|5197->2842|5234->2943|5271->3049|5306->3065|5340->3080|5565->3269|5580->3275|5634->3307|5706->3343|5721->3349|5771->3377|5847->3417|5862->3423|5917->3456|6012->3516|6046->3541|6086->3543|6177->3598|6192->3604|6234->3624|6344->3717|6357->3722|6396->3723|6823->4114|6839->4121|6874->4134|6992->4216|7007->4222|7050->4243|7131->4293|7185->4312|7203->4321|7243->4323|7428->4477
                    LINES: 56->18|59->18|70->29|70->29|70->29|71->30|71->30|71->30|81->40|81->40|81->40|91->50|91->50|91->50|92->51|92->51|92->51|95->54|96->55|97->56|98->57|99->58|100->59|101->60|102->61|108->67|108->67|108->67|109->68|109->68|109->68|110->69|110->69|110->69|114->73|114->73|114->73|115->74|115->74|115->74|118->77|118->77|118->77|128->87|128->87|128->87|130->89|130->89|130->89|133->92|135->94|135->94|135->94|139->98
                    -- GENERATED --
                */
            