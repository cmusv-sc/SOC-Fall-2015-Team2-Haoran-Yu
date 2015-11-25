
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
object comment extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[models.Comment],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(commentForm: play.data.Form[models.Comment]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*4.2*/scripts/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.11*/("""
	<script src='"""),_display_(Seq[Any](/*5.16*/routes/*5.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*5.62*/("""'></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
	<script type="text/javascript">

	
		var all_hash;
		var all_user;
		function getAllHashtag()"""),format.raw/*14.27*/("""{"""),format.raw/*14.28*/("""
			  $.ajax("""),format.raw/*15.13*/("""{"""),format.raw/*15.14*/("""
					url: "/getAllHashtag",
					dataType: "json",
					async : false,
				"""),format.raw/*19.5*/("""}"""),format.raw/*19.6*/(""").done(function(data) """),format.raw/*19.28*/("""{"""),format.raw/*19.29*/("""

					// alert(data['hash_tag']);
					// console.log(data['hash_tag']);
					var response = data['hash_tag'];
					
					
					// console.log("test2");
					// console.log(v1.length);
					// console.log(v1[5]);
					// alert("finished");
					all_hash = response.split(";");
					// return;
					
				"""),format.raw/*33.5*/("""}"""),format.raw/*33.6*/(""");
		"""),format.raw/*34.3*/("""}"""),format.raw/*34.4*/("""


		function getAllUser()"""),format.raw/*37.24*/("""{"""),format.raw/*37.25*/("""
				$.ajax("""),format.raw/*38.12*/("""{"""),format.raw/*38.13*/("""
					url: "/getAllUsers",
					dataType: "json",
					async : false,
				"""),format.raw/*42.5*/("""}"""),format.raw/*42.6*/(""").done(function(data) """),format.raw/*42.28*/("""{"""),format.raw/*42.29*/("""

					// alert(data['hash_tag']);
					// console.log(data['hash_tag']);

					//不确定tag的名字是啥
					var response = data['userName'];
					
					// console.log("test2");
					// console.log(v1.length);
					// console.log(v1[5]);
					// alert("finished");
					all_user = response.split(";");
					// return;
					
				"""),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""");
		"""),format.raw/*58.3*/("""}"""),format.raw/*58.4*/("""


		$(function() """),format.raw/*61.16*/("""{"""),format.raw/*61.17*/("""
			// var availableDataSetNames = [
	  //               "AIRS Air Temperature",
			// 		"interim Sea Surface Temperature",
			// 		"interim Total Cloud Fraction",
			// 		"interim Vertical Wind Velocity" ];
	
			getAllHashtag();
			getAllUser();

			$("#hash_tag").autocomplete("""),format.raw/*71.32*/("""{"""),format.raw/*71.33*/("""
				source : all_hash
			"""),format.raw/*73.4*/("""}"""),format.raw/*73.5*/(""");

			$("#at_tag").autocomplete("""),format.raw/*75.30*/("""{"""),format.raw/*75.31*/("""
				source : all_user
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/(""");
		"""),format.raw/*78.3*/("""}"""),format.raw/*78.4*/(""");
	</script>
""")))};
Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*80.2*/("""

"""),_display_(Seq[Any](/*82.2*/main("Comment",scripts)/*82.25*/ {_display_(Seq[Any](format.raw/*82.27*/("""  
	
	"""),_display_(Seq[Any](/*84.3*/helper/*84.9*/.form(action = routes.Application.createNewComment)/*84.60*/ {_display_(Seq[Any](format.raw/*84.62*/("""
<div class="container"
	style="background-image: url('"""),_display_(Seq[Any](/*86.33*/routes/*86.39*/.Assets.at("images/login-background.jpg"))),format.raw/*86.80*/("""'); height: 90vh; background-size: 100%; ">
	<div
		class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form class="form-signin">
			<h1 class="form-signin-heading" align="center">Comment And Rating</h1>

			<div class="row">
					<div class="form-group">
						<div class="form-group">
						Service Name: 
							<select id="drop_service" name="drop_service" class="form-control" value='"""),_display_(Seq[Any](/*96.83*/commentForm("serviceName")/*96.109*/.value)),format.raw/*96.115*/("""'>
		  						<option value="2-D-Variable-Map">2-D-Variable-Map</option>
		  						<option value="2-D-Variable-Zonal-Mean">2-D-Variable-Zonal-Mean</option>
		  						<option value="2-D-Variable-Time-Series">2-D-Variable-Time-Series</option>
		  						<option value="3-D-Variable-2-D-Slice">3-D-Variable-2-D-Slice</option>
		  						<option value="3-D-Variable-Zonal-Mean">3-D-Variable-Zonal-Mean</option>
		  						<option value="3-D-Variable-Average-Vertical-Profile">3-D-Variable-Average-Vertical-Profile</option>
		  						<option value="Scatter-and-Histogram-Plot-of-Two-Variables">Scatter-and-Histogram-Plot-of-Two-Variables</option>
		  						<option value="Difference-Plot-of-Two-Time-Averaged-Variables">Difference-Plot-of-Two-Time-Averaged-Variables</option>
		  						<option value="Conditional-Sampling-with-One-Variable">Conditional-Sampling-with-One-Variable</option>
		  						<option value="Conditional-Sampling-with-Two-Variables">Conditional-Sampling-with-Two-Variables</option>
		  						<option value="Time-Lagged-Correlation-Map-of-Two-Variables">Time-Lagged-Correlation-Map-of-Two-Variables</option>
		  						<option value="Regrid-and-Download">Regrid-and-Download</option>
							</select>
						</div>
					</div>
			</div>

			<div class="row">
					<div class="form-group">
						Rating: 
						<select id="drop_rating" name="drop_rating" class="form-control" value='"""),_display_(Seq[Any](/*117.80*/commentForm("rate")/*117.99*/.value)),format.raw/*117.105*/("""'>
	  						<option value="5">5</option>
	  						<option value="4">4</option>
	  						<option value="3">3</option>
	  						<option value="2">2</option>
	  						<option value="1">1</option>
						</select>
					</div>
			</div>

			<div class="row">
					<div class="form-group">
						"""),_display_(Seq[Any](/*129.8*/inputText(commentForm("at_tag"), 'class -> "form-control", 'id -> "at_tag", 'placeholder -> "@", 'size->70))),format.raw/*129.115*/("""
					</div>
			</div>

			
			<div class="row">
					<div class="form-group">
					"""),_display_(Seq[Any](/*136.7*/inputText(commentForm("hash_tag"), 'class -> "form-control", 'id -> "hash_tag", 'placeholder -> "#", 'size->70))),format.raw/*136.118*/("""

						<!-- <input type="text" name="hash_tag" id="hash_tag" class="form-control"
							placeholder="#" required="" value='"""),_display_(Seq[Any](/*139.44*/commentForm("hash_tag")/*139.67*/.value)),format.raw/*139.73*/("""' onchange=""> -->
					</div>
			</div>			

			<div class="row">
					<div class="form-group">
						<input type="text" name="comment" id="comment"
							class="form-control" placeholder="Comment Here"
							value='"""),_display_(Seq[Any](/*147.16*/commentForm("comment")/*147.38*/.value)),format.raw/*147.44*/("""'>
					</div>
			</div>


			<div class="actions row">
					<input type="submit" class="btn btn-primary btn-block"
						value="Submit" id="Submit">
			</div>

			
		</form>
	</div>
</div>

""")))})),format.raw/*162.2*/(""" 
""")))})))}
    }
    
    def render(commentForm:play.data.Form[models.Comment]): play.api.templates.HtmlFormat.Appendable = apply(commentForm)
    
    def f:((play.data.Form[models.Comment]) => play.api.templates.HtmlFormat.Appendable) = (commentForm) => apply(commentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 24 21:52:53 EST 2015
                    SOURCE: /Users/Tongyun/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/comment.scala.html
                    HASH: 0bbdefdf973a3cb646d698068810e6b94557b528
                    MATRIX: 808->1|946->66|960->73|1044->75|1095->91|1109->97|1170->137|1524->463|1553->464|1594->477|1623->478|1726->554|1754->555|1804->577|1833->578|2164->882|2192->883|2224->888|2252->889|2306->915|2335->916|2375->928|2404->929|2505->1003|2533->1004|2583->1026|2612->1027|2957->1345|2985->1346|3017->1351|3045->1352|3091->1370|3120->1371|3427->1650|3456->1651|3509->1677|3537->1678|3598->1711|3627->1712|3680->1738|3708->1739|3740->1744|3768->1745|3822->46|3849->64|3877->1760|3915->1763|3947->1786|3987->1788|4029->1795|4043->1801|4103->1852|4143->1854|4235->1910|4250->1916|4313->1957|4759->2367|4795->2393|4824->2399|6254->3792|6283->3811|6313->3817|6639->4107|6770->4214|6891->4299|7026->4410|7189->4536|7222->4559|7251->4565|7507->4784|7539->4806|7568->4812|7792->5004
                    LINES: 26->1|29->4|29->4|31->4|32->5|32->5|32->5|41->14|41->14|42->15|42->15|46->19|46->19|46->19|46->19|60->33|60->33|61->34|61->34|64->37|64->37|65->38|65->38|69->42|69->42|69->42|69->42|84->57|84->57|85->58|85->58|88->61|88->61|98->71|98->71|100->73|100->73|102->75|102->75|104->77|104->77|105->78|105->78|108->1|109->3|110->80|112->82|112->82|112->82|114->84|114->84|114->84|114->84|116->86|116->86|116->86|126->96|126->96|126->96|147->117|147->117|147->117|159->129|159->129|166->136|166->136|169->139|169->139|169->139|177->147|177->147|177->147|192->162
                    -- GENERATED --
                */
            