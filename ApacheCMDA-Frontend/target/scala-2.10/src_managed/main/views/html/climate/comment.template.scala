
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


		function getAllHashtag()"""),format.raw/*12.27*/("""{"""),format.raw/*12.28*/("""
			$.ajax("""),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""
					url: "/getAllHashtag",
					dataType: "json"
				"""),format.raw/*16.5*/("""}"""),format.raw/*16.6*/(""").done(function(data) """),format.raw/*16.28*/("""{"""),format.raw/*16.29*/("""
					console.log(data);
					var response = data['item'];
					return response.split(";");
					
				"""),format.raw/*21.5*/("""}"""),format.raw/*21.6*/(""");
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/("""


		$(function() """),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""

			var availableDataSetNames = [
	                "AIRS Air Temperature",
					"interim Sea Surface Temperature",
					"interim Total Cloud Fraction",
					"interim Vertical Wind Velocity" ];
					
			var allHashTag = getAllHashtag();

			$("#hash_tag").autocomplete("""),format.raw/*35.32*/("""{"""),format.raw/*35.33*/("""
				source : allHashTag
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/(""");

			$("#at_tag").autocomplete("""),format.raw/*39.30*/("""{"""),format.raw/*39.31*/("""
				source : availableDataSetNames
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/(""");
		"""),format.raw/*42.3*/("""}"""),format.raw/*42.4*/(""");
	</script>
""")))};
Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*44.2*/("""

"""),_display_(Seq[Any](/*46.2*/main("Comment",scripts)/*46.25*/ {_display_(Seq[Any](format.raw/*46.27*/("""  
	
	"""),_display_(Seq[Any](/*48.3*/helper/*48.9*/.form(action = routes.Application.createNewComment)/*48.60*/ {_display_(Seq[Any](format.raw/*48.62*/("""
<div class="container"
	style="background-image: url('"""),_display_(Seq[Any](/*50.33*/routes/*50.39*/.Assets.at("images/login-background.jpg"))),format.raw/*50.80*/("""'); height: 90vh; background-size: 100%; ">
	<div
		class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form class="form-signin">
			<h1 class="form-signin-heading" align="center">Comment And Rating</h1>

			<div class="row">
					<div class="form-group">
						<div class="form-group">
						Service Name: 
							<select id="drop_service" name="drop_service" class="form-control" value='"""),_display_(Seq[Any](/*60.83*/commentForm("serviceName")/*60.109*/.value)),format.raw/*60.115*/("""'>
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
						<select id="drop_rating" name="drop_rating" class="form-control" value='"""),_display_(Seq[Any](/*81.80*/commentForm("rate")/*81.99*/.value)),format.raw/*81.105*/("""'>
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
						"""),_display_(Seq[Any](/*93.8*/inputText(commentForm("at_tag"), 'class -> "form-control", 'id -> "at_tag", 'placeholder -> "@", 'size->70))),format.raw/*93.115*/("""
					</div>
			</div>

			
			<div class="row">
					<div class="form-group">
					"""),_display_(Seq[Any](/*100.7*/inputText(commentForm("hash_tag"), 'class -> "form-control", 'id -> "hash_tag", 'placeholder -> "#", 'size->70))),format.raw/*100.118*/("""

						<!-- <input type="text" name="hash_tag" id="hash_tag" class="form-control"
							placeholder="#" required="" value='"""),_display_(Seq[Any](/*103.44*/commentForm("hash_tag")/*103.67*/.value)),format.raw/*103.73*/("""' onchange=""> -->
					</div>
			</div>			

			<div class="row">
					<div class="form-group">
						<input type="text" name="comment" id="comment"
							class="form-control" placeholder="Comment Here"
							value='"""),_display_(Seq[Any](/*111.16*/commentForm("comment")/*111.38*/.value)),format.raw/*111.44*/("""'>
					</div>
			</div>


			<div class="actions row">
					<input type="submit" class="btn btn-primary btn-block"
						value="Submit" id="Submit">
			</div>

			
		</form>
	</div>
</div>

""")))})),format.raw/*126.2*/(""" 
""")))})))}
    }
    
    def render(commentForm:play.data.Form[models.Comment]): play.api.templates.HtmlFormat.Appendable = apply(commentForm)
    
    def f:((play.data.Form[models.Comment]) => play.api.templates.HtmlFormat.Appendable) = (commentForm) => apply(commentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 19 00:04:09 EST 2015
                    SOURCE: /Users/Tongyun/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/comment.scala.html
                    HASH: 7c4bba3fc04c418b7daa7e3a48804edb8ccf5b19
                    MATRIX: 808->1|946->66|960->73|1044->75|1095->91|1109->97|1170->137|1491->430|1520->431|1559->442|1588->443|1670->498|1698->499|1748->521|1777->522|1906->624|1934->625|1966->630|1994->631|2040->649|2069->650|2366->919|2395->920|2450->948|2478->949|2539->982|2568->983|2634->1022|2662->1023|2694->1028|2722->1029|2776->46|2803->64|2831->1044|2869->1047|2901->1070|2941->1072|2983->1079|2997->1085|3057->1136|3097->1138|3189->1194|3204->1200|3267->1241|3713->1651|3749->1677|3778->1683|5207->3076|5235->3095|5264->3101|5589->3391|5719->3498|5840->3583|5975->3694|6138->3820|6171->3843|6200->3849|6456->4068|6488->4090|6517->4096|6741->4288
                    LINES: 26->1|29->4|29->4|31->4|32->5|32->5|32->5|39->12|39->12|40->13|40->13|43->16|43->16|43->16|43->16|48->21|48->21|49->22|49->22|52->25|52->25|62->35|62->35|64->37|64->37|66->39|66->39|68->41|68->41|69->42|69->42|72->1|73->3|74->44|76->46|76->46|76->46|78->48|78->48|78->48|78->48|80->50|80->50|80->50|90->60|90->60|90->60|111->81|111->81|111->81|123->93|123->93|130->100|130->100|133->103|133->103|133->103|141->111|141->111|141->111|156->126
                    -- GENERATED --
                */
            