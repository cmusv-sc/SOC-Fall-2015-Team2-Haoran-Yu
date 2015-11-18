
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
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: play.data.Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.43*/("""

"""),_display_(Seq[Any](/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""  
    
    """),_display_(Seq[Any](/*5.6*/helper/*5.12*/.form(routes.Application.authenticate())/*5.52*/ {_display_(Seq[Any](format.raw/*5.54*/("""

		<div class="container" style="height:80vh; background-size: 100%;">
			<div class="col-sm-6 col-md-4 col-md-offset-4" style="background: rgba(255,255,255,0.7); border-radius:3px; top:25%;">
			<form class="form-signin">
				<h1 class="form-signin-heading" align="center">Sign in</h1>
				<div class="form-group">
					<label for="inputEmail" class="sr-only">Email address</label> 
					<input
						type="email" name="email" id="email" class="form-control"
						placeholder="Email address" required="" autofocus="" value='"""),_display_(Seq[Any](/*15.68*/form("email")/*15.81*/.value)),format.raw/*15.87*/("""'>
				</div>
				<div class="form-group">
					<label for="inputPassword" class="sr-only">Password</label> 
					<input
						type="password" name="password" id="password" class="form-control"
						placeholder="Password" required=""
						value = '"""),_display_(Seq[Any](/*22.17*/form("password")/*22.33*/.value)),format.raw/*22.39*/("""'>
				</div>
				<div class="form-group" style="color: red;">
				"""),_display_(Seq[Any](/*25.6*/if(form.hasGlobalErrors)/*25.30*/ {_display_(Seq[Any](format.raw/*25.32*/(""" 
            	<p class="error">
                	"""),_display_(Seq[Any](/*27.19*/form/*27.23*/.globalError.message)),format.raw/*27.43*/("""
            	</p>
        		""")))})),format.raw/*29.12*/("""
        		"""),_display_(Seq[Any](/*30.12*/if(flash.contains("success"))/*30.41*/ {_display_(Seq[Any](format.raw/*30.43*/("""
            	<p class="success">
                	"""),_display_(Seq[Any](/*32.19*/flash/*32.24*/.get("success"))),format.raw/*32.39*/("""
            	</p>
        		""")))})),format.raw/*34.12*/("""
				<button class="btn btn-primary btn-block" type="submit">Sign in</button>
				</div>
				<div class="form-group" align="center">
					<span >
					New User?
					<a href='"""),_display_(Seq[Any](/*40.16*/routes/*40.22*/.Application.signup())),format.raw/*40.43*/("""'>Sign up</a>
					</span>
				</div>
			</form>
			</div>
		</div>
""")))})),format.raw/*46.2*/("""
	
""")))})),format.raw/*48.2*/("""
    

"""))}
    }
    
    def render(form:play.data.Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((play.data.Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 17 23:50:01 EST 2015
                    SOURCE: /Users/Tongyun/Desktop/SOC-Fall-2015-master/ApacheCMDA-Frontend/app/views/climate/login.scala.html
                    HASH: ef692179cecf6beebdf184ec5278385e2f2cda6f
                    MATRIX: 809->1|944->42|981->45|1002->58|1041->60|1088->73|1102->79|1150->119|1189->121|1753->649|1775->662|1803->668|2090->919|2115->935|2143->941|2246->1009|2279->1033|2319->1035|2406->1086|2419->1090|2461->1110|2523->1140|2571->1152|2609->1181|2649->1183|2737->1235|2751->1240|2788->1255|2850->1285|3062->1461|3077->1467|3120->1488|3220->1557|3255->1561
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|43->15|43->15|43->15|50->22|50->22|50->22|53->25|53->25|53->25|55->27|55->27|55->27|57->29|58->30|58->30|58->30|60->32|60->32|60->32|62->34|68->40|68->40|68->40|74->46|76->48
                    -- GENERATED --
                */
            