
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editComp_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class editComp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Company],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(compForm : Form[Company]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		<title>Update Company</title>
	</head>
	<body>
		<h1>Update Company</h1>
		"""),_display_(/*9.4*/helper/*9.10*/.form(action = routes.RestController.updateCompany())/*9.63*/ {_display_(Seq[Any](format.raw/*9.65*/("""


        """),_display_(/*12.10*/helper/*12.16*/.inputText(compForm("compId"))),format.raw/*12.46*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(compForm("compName"))),format.raw/*13.48*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(compForm("slaTime"))),format.raw/*14.47*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(compForm("slaPercentage"))),format.raw/*15.53*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(compForm("currentSlaPercentage"))),format.raw/*16.60*/("""
        """),format.raw/*17.9*/("""<button type="submit">Update Company</button>

    """)))}),format.raw/*19.6*/("""
	"""),format.raw/*20.2*/("""</body>
</html>

"""))
      }
    }
  }

  def render(compForm:Form[Company]): play.twirl.api.HtmlFormat.Appendable = apply(compForm)

  def f:((Form[Company]) => play.twirl.api.HtmlFormat.Appendable) = (compForm) => apply(compForm)

  def ref: this.type = this

}


}

/**/
object editComp extends editComp_Scope0.editComp
              /*
                  -- GENERATED --
                  DATE: Wed Aug 14 12:12:41 CEST 2019
                  SOURCE: C:/Test/de.idnow.example/app/views/editComp.scala.html
                  HASH: 833bf380e99b4ce48edab3625684924036e4736b
                  MATRIX: 758->1|879->27|907->29|1025->122|1039->128|1100->181|1139->183|1178->195|1193->201|1244->231|1281->241|1296->247|1349->279|1386->289|1401->295|1453->326|1490->336|1505->342|1563->379|1600->389|1615->395|1680->439|1716->448|1798->500|1827->502
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|50->19|51->20
                  -- GENERATED --
              */
          