
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*18.2*/main("Login")/*18.15*/ {_display_(Seq[Any](format.raw/*18.17*/("""

<div class="jumbotron">
        <div class="row">
                <div class="col-lg-5">
                        </br></br>
                        <img src="/assets/images/main.jpg" height="480" width="330" />
                </div>
                <div class="col-lg-6">
                        <h2>18655 Project 1</h2>
                <table>
                 <tr>
                         <td> Username: </td>
                         <td> <input id="x" type="text" size="40"/> </td>
                     </tr>
                 <tr>
                         <td> Password: </td>
                         <td> <input id="y" type="text" size="40"/> </td>
                     </tr>
                     <tr>
                         <td colspan="2">
                         <input type="button" value="Login" onClick = "location.href = 'home'" >
                         <input type="button" value="Register" onClick = "location.href = 'register'">
                     </td>
                 </tr>
        </table>

                </div>
        </div>
</div>

""")))})),format.raw/*49.2*/("""


"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 21:18:47 EST 2015
                    SOURCE: /Users/User/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/login.scala.html
                    HASH: 10f7d809b75ff54bbb6b26e9424172ae180ef89e
                    MATRIX: 3267->1205|3289->1218|3329->1220|4429->2289
                    LINES: 59->18|59->18|59->18|90->49
                    -- GENERATED --
                */
            