
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


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main("Comment")/*5.17*/ {_display_(Seq[Any](format.raw/*5.19*/("""  
	
	"""),_display_(Seq[Any](/*7.3*/helper/*7.9*/.form(action = routes.Application.createNewComment)/*7.60*/ {_display_(Seq[Any](format.raw/*7.62*/("""
<div class="container"
	style="background-image: url('"""),_display_(Seq[Any](/*9.33*/routes/*9.39*/.Assets.at("images/login-background.jpg"))),format.raw/*9.80*/("""'); height: 90vh; background-size: 100%; ">
	<div
		class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
		<form class="form-signin">
			<h1 class="form-signin-heading" align="center">Comment And Rating</h1>

			<div class="row">
					<div class="form-group">
						<div class="form-group">
						Service Name: 
							<select id="drop_service" name="drop_service" class="form-control" value='"""),_display_(Seq[Any](/*19.83*/commentForm("serviceName")/*19.109*/.value)),format.raw/*19.115*/("""'>
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
						<select id="drop_rating" name="drop_rating" class="form-control" value='"""),_display_(Seq[Any](/*40.80*/commentForm("rate")/*40.99*/.value)),format.raw/*40.105*/("""'>
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
						<input type="text" name="comment" id="comment"
							class="form-control" placeholder="Comment Here"
							value='"""),_display_(Seq[Any](/*55.16*/commentForm("comment")/*55.38*/.value)),format.raw/*55.44*/("""'>
					</div>
			</div>


			<div class="actions row">
					<input type="submit" class="btn btn-primary btn-block"
						value="Submit" id="Submit">
			</div>

			
		</form>
	</div>
</div>

""")))})),format.raw/*70.2*/(""" 
""")))})))}
    }
    
    def render(commentForm:play.data.Form[models.Comment]): play.api.templates.HtmlFormat.Appendable = apply(commentForm)
    
    def f:((play.data.Form[models.Comment]) => play.api.templates.HtmlFormat.Appendable) = (commentForm) => apply(commentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 18 11:59:07 EST 2015
                    SOURCE: /Users/weitingzhai/Documents/655niubiban/SOC-Fall-2015-Team2-Haoran-Yu/ApacheCMDA-Frontend/app/views/climate/comment.scala.html
                    HASH: 8cbf5f52be46d3be3230f674d81f8ff7ad56a36b
                    MATRIX: 808->1|963->46|990->64|1027->67|1050->82|1089->84|1130->91|1143->97|1202->148|1241->150|1332->206|1346->212|1408->253|1854->663|1890->689|1919->695|3348->2088|3376->2107|3405->2113|3848->2520|3879->2542|3907->2548|4130->2740
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|35->7|37->9|37->9|37->9|47->19|47->19|47->19|68->40|68->40|68->40|83->55|83->55|83->55|98->70
                    -- GENERATED --
                */
            