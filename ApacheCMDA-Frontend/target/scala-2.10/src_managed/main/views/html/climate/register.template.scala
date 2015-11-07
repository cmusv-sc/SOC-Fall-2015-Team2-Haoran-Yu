
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
 * Licensed to the Apache Software Foundation (ASF) under one or more          *
 * contributor license agreements.  See the NOTICE file distributed with       *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *                                                                             *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.                                              *
 *******************************************************************************/
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.User],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more          *
 * contributor license agreements.  See the NOTICE file distributed with       *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *                                                                             *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.                                              *
 *******************************************************************************/
    def apply/*18.2*/(userForm:play.data.Form[metadata.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
    <script src='"""),_display_(Seq[Any](/*22.19*/routes/*22.25*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.65*/("""'></script>
""")))};
Seq[Any](format.raw/*18.42*/("""
"""),format.raw/*20.1*/("""
"""),format.raw/*23.2*/("""

"""),_display_(Seq[Any](/*25.2*/main("Register", scripts)/*25.27*/ {_display_(Seq[Any](format.raw/*25.29*/("""   
    """),_display_(Seq[Any](/*26.6*/flash_message())),format.raw/*26.21*/("""    
     """),_display_(Seq[Any](/*27.7*/if(true)/*27.15*/{_display_(Seq[Any](format.raw/*27.16*/("""
        <h1>Register</h1>
        """),_display_(Seq[Any](/*29.10*/form(routes.ClimateServiceController.userRegister())/*29.62*/ {_display_(Seq[Any](format.raw/*29.64*/("""   
            """),_display_(Seq[Any](/*30.14*/inputText(
                userForm("userName"),
                '_label -> "userName"
            ))),format.raw/*33.14*/("""
            """),_display_(Seq[Any](/*34.14*/inputText(
                userForm("password"),
                '_label -> "password"
            ))),format.raw/*37.14*/("""
            """),_display_(Seq[Any](/*38.14*/inputText(
                userForm("firstName"),
                '_label -> "First Name"
            ))),format.raw/*41.14*/(""" 
            """),_display_(Seq[Any](/*42.14*/inputText(
                userForm("lastName"),
                '_label -> "Last Name"
            ))),format.raw/*45.14*/("""
             """),_display_(Seq[Any](/*46.15*/inputText(
                userForm("email"),
                '_label -> "Email"
            ))),format.raw/*49.14*/(""" 
            
            <input class="btn" type="submit" value="Register">
            <a href=""""),_display_(Seq[Any](/*52.23*/routes/*52.29*/.ClimateServiceController.climateServices())),format.raw/*52.72*/("""" class="btn">Cancel</a>
        """)))})),format.raw/*53.10*/("""
    """)))})),format.raw/*54.6*/("""
""")))})),format.raw/*55.2*/("""

"""))}
    }
    
    def render(userForm:play.data.Form[metadata.User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((play.data.Form[metadata.User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 21:18:47 EST 2015
                    SOURCE: /Users/User/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/register.scala.html
                    HASH: c4b6dade3d7f49c505598c6d57191630ab23b92e
                    MATRIX: 3393->1300|3527->1360|3542->1367|3627->1371|3682->1390|3697->1396|3759->1436|3812->1340|3840->1358|3868->1449|3906->1452|3940->1477|3980->1479|4024->1488|4061->1503|4107->1514|4124->1522|4163->1523|4235->1559|4296->1611|4336->1613|4389->1630|4511->1730|4561->1744|4683->1844|4733->1858|4858->1961|4909->1976|5032->2077|5083->2092|5199->2186|5335->2286|5350->2292|5415->2335|5481->2369|5518->2375|5551->2377
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|64->18|65->20|66->23|68->25|68->25|68->25|69->26|69->26|70->27|70->27|70->27|72->29|72->29|72->29|73->30|76->33|77->34|80->37|81->38|84->41|85->42|88->45|89->46|92->49|95->52|95->52|95->52|96->53|97->54|98->55
                    -- GENERATED --
                */
            