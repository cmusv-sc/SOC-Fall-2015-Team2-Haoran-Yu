
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
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: play.data.Form[models.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""

<script type="text/javascript">
		function checkpwd()"""),format.raw/*6.22*/("""{"""),format.raw/*6.23*/("""
				var p1=document.getElementById("password").value;
				var p2=document.getElementById("repassword").value;
				if(p1!=p2)"""),format.raw/*9.15*/("""{"""),format.raw/*9.16*/("""
					document.getElementById("msg").innerHTML="Please check that your passwords match";
					document.getElementById("create").disabled = true;
					
				"""),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""else"""),format.raw/*13.10*/("""{"""),format.raw/*13.11*/("""
					document.getElementById("msg").innerHTML = "";
					document.getElementById("create").disabled = false;
					return true;
				"""),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
		"""),format.raw/*18.3*/("""}"""),format.raw/*18.4*/("""
		
		function isEmailExisted() """),format.raw/*20.29*/("""{"""),format.raw/*20.30*/("""
			var email = document.getElementById("email").value;
			var obj = """),format.raw/*22.14*/("""{"""),format.raw/*22.15*/("""
					email : email
			"""),format.raw/*24.4*/("""}"""),format.raw/*24.5*/("""
			$.ajax("""),format.raw/*25.11*/("""{"""),format.raw/*25.12*/("""
				url: "/isEmailExisted",
				data: JSON.stringify(obj),
				headers: """),format.raw/*28.14*/("""{"""),format.raw/*28.15*/("""
					'Content-Type': 'application/json'
				"""),format.raw/*30.5*/("""}"""),format.raw/*30.6*/(""",
				type: "POST"
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/(""").done(function(data) """),format.raw/*32.27*/("""{"""),format.raw/*32.28*/("""
				console.log(data);
				var response = data;
				if("error" in response)"""),format.raw/*35.28*/("""{"""),format.raw/*35.29*/("""
					document.getElementById("msg1").innerHTML = "Email already used";
					document.getElementById("create").disabled = true;
				"""),format.raw/*38.5*/("""}"""),format.raw/*38.6*/("""else"""),format.raw/*38.10*/("""{"""),format.raw/*38.11*/("""
					document.getElementById("msg1").innerHTML = "";
					document.getElementById("create").disabled = false;
					return true;
				"""),format.raw/*42.5*/("""}"""),format.raw/*42.6*/("""
			"""),format.raw/*43.4*/("""}"""),format.raw/*43.5*/(""");
		"""),format.raw/*44.3*/("""}"""),format.raw/*44.4*/("""
</script>

"""),_display_(Seq[Any](/*47.2*/main("Signup")/*47.16*/ {_display_(Seq[Any](format.raw/*47.18*/("""  
	
	"""),_display_(Seq[Any](/*49.3*/helper/*49.9*/.form(action = routes.Application.createNewUser())/*49.59*/ {_display_(Seq[Any](format.raw/*49.61*/("""
<div class="container"
	style="background-image: url('"""),_display_(Seq[Any](/*51.33*/routes/*51.39*/.Assets.at("images/login-background.jpg"))),format.raw/*51.80*/("""'); height: 90vh; background-size: 100%; ">
	<div
		class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form class="form-signin">
			<h1 class="form-signin-heading" align="center">Sign up</h1>
			<div class="row">
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
						<input type="text" name="firstName" id="firstName"
							class="form-control" placeholder="First Name" required=""
							value='"""),_display_(Seq[Any](/*61.16*/userForm("firstName")/*61.37*/.value)),format.raw/*61.43*/("""'>
					</div>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
						<input type="text" name="middleInitial" id="middleInitial"
							class="form-control" placeholder="Middle Name"
							value='"""),_display_(Seq[Any](/*68.16*/userForm("middleInitial")/*68.41*/.value)),format.raw/*68.47*/("""'>
					</div>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
						<input type="text" name="lastName" id="lastName"
							class="form-control" placeholder="Last Name" required=""
							value='"""),_display_(Seq[Any](/*75.16*/userForm("lastName")/*75.36*/.value)),format.raw/*75.42*/("""'>
					</div>
				</div>
			</div>
			
			<div class="form-group">
				<input type="email" name="email" id="email" class="form-control"
					placeholder="Email address" required=""
					value='"""),_display_(Seq[Any](/*83.14*/userForm("email")/*83.31*/.value)),format.raw/*83.37*/("""' onchange="isEmailExisted()">
			</div>
			<div class="form-group" id="msg1" style="color: red;"></div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
						<input type="password" name="password" id="password"
							class="form-control" placeholder="Password" required=""
							value='"""),_display_(Seq[Any](/*92.16*/userForm("password")/*92.36*/.value)),format.raw/*92.42*/("""'>
					</div>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
						<input type="password" name="repassword" id="repassword"
							class="form-control" placeholder="Re-enter Password"
							oninput="checkpwd()" />
					</div>
				</div>
			</div>
			<div class="form-group" id="msg" style="color: red;"></div>
			
			<div class="form-group">
				<input type="text" name="affiliation" id="affiliation"
					class="form-control" placeholder="Affiliation"
					value='"""),_display_(Seq[Any](/*108.14*/userForm("affiliation")/*108.37*/.value)),format.raw/*108.43*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="title" id="title" class="form-control"
					placeholder="Title" value='"""),_display_(Seq[Any](/*112.34*/userForm("title")/*112.51*/.value)),format.raw/*112.57*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="mailingAddress" id="mailingAddress"
					class="form-control" placeholder="Mailing Address"
					value='"""),_display_(Seq[Any](/*117.14*/userForm("mailingAddress")/*117.40*/.value)),format.raw/*117.46*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="phoneNumber" id="phoneNumber"
					class="form-control" placeholder="Phone Number"
					value='"""),_display_(Seq[Any](/*122.14*/userForm("phoneNumber")/*122.37*/.value)),format.raw/*122.43*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="faxNumber" id="faxNumber"
					class="form-control" placeholder="Fax Number"
					value='"""),_display_(Seq[Any](/*127.14*/userForm("faxNumber")/*127.35*/.value)),format.raw/*127.41*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="researchFields" id="researchFields"
					class="form-control" placeholder="Research Fields"
					value='"""),_display_(Seq[Any](/*132.14*/userForm("researchFields")/*132.40*/.value)),format.raw/*132.46*/("""'>
			</div>
			<div class="form-group">
				<input type="text" name="highestDegree" id="highestDegree"
					class="form-control" placeholder="Highest Degree"
					value='"""),_display_(Seq[Any](/*137.14*/userForm("highestDegree")/*137.39*/.value)),format.raw/*137.45*/("""'>
			</div>

			<div class="actions row">
				<div class="col-xs-12 col-sm-6 col-md-6">
					<input type="submit" class="btn btn-primary btn-block"
						value="Create" id="create">
				</div>
				<div class="col-xs-12 col-sm-6 col-md-6">
					<a href=""""),_display_(Seq[Any](/*146.16*/routes/*146.22*/.Application.login())),format.raw/*146.42*/("""" class="btn btn-success btn-block">Sign in</a>
				</div>
			</div>
		</form>
	</div>
</div>

""")))})),format.raw/*153.2*/(""" 
""")))})),format.raw/*154.2*/("""
"""))}
    }
    
    def render(userForm:play.data.Form[models.User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((play.data.Form[models.User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 17 22:57:10 EST 2015
                    SOURCE: /Users/Tongyun/Desktop/SOC-Fall-2015-master/ApacheCMDA-Frontend/app/views/climate/signup.scala.html
                    HASH: b584bb7c90129f4b18b99a29771490f9b7fdd84e
                    MATRIX: 804->1|953->40|980->58|1062->113|1090->114|1242->239|1270->240|1452->395|1480->396|1512->400|1541->401|1700->533|1728->534|1758->537|1786->538|1846->570|1875->571|1972->640|2001->641|2051->664|2079->665|2118->676|2147->677|2248->750|2277->751|2349->796|2377->797|2426->819|2454->820|2504->842|2533->843|2637->919|2666->920|2825->1052|2853->1053|2885->1057|2914->1058|3074->1191|3102->1192|3133->1196|3161->1197|3193->1202|3221->1203|3269->1216|3292->1230|3332->1232|3374->1239|3388->1245|3447->1295|3487->1297|3579->1353|3594->1359|3657->1400|4140->1847|4170->1868|4198->1874|4470->2110|4504->2135|4532->2141|4804->2377|4833->2397|4861->2403|5092->2598|5118->2615|5146->2621|5525->2964|5554->2984|5582->2990|6127->3498|6160->3521|6189->3527|6368->3669|6395->3686|6424->3692|6636->3867|6672->3893|6701->3899|6904->4065|6937->4088|6966->4094|7163->4254|7194->4275|7223->4281|7435->4456|7471->4482|7500->4488|7709->4660|7744->4685|7773->4691|8065->4946|8081->4952|8124->4972|8252->5068|8287->5071
                    LINES: 26->1|30->1|31->3|34->6|34->6|37->9|37->9|41->13|41->13|41->13|41->13|45->17|45->17|46->18|46->18|48->20|48->20|50->22|50->22|52->24|52->24|53->25|53->25|56->28|56->28|58->30|58->30|60->32|60->32|60->32|60->32|63->35|63->35|66->38|66->38|66->38|66->38|70->42|70->42|71->43|71->43|72->44|72->44|75->47|75->47|75->47|77->49|77->49|77->49|77->49|79->51|79->51|79->51|89->61|89->61|89->61|96->68|96->68|96->68|103->75|103->75|103->75|111->83|111->83|111->83|120->92|120->92|120->92|136->108|136->108|136->108|140->112|140->112|140->112|145->117|145->117|145->117|150->122|150->122|150->122|155->127|155->127|155->127|160->132|160->132|160->132|165->137|165->137|165->137|174->146|174->146|174->146|181->153|182->154
                    -- GENERATED --
                */
            