
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createComp_Scope0 {
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

class createComp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Company],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(compForm : Form[Company]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		<title>Create Company</title>
	</head>
	<body>
		<h1>Create Company</h1>
		"""),_display_(/*9.4*/helper/*9.10*/.form(action = routes.RestController.addCompany())/*9.60*/ {_display_(Seq[Any](format.raw/*9.62*/("""


        """),_display_(/*12.10*/helper/*12.16*/.inputText(compForm("compId"))),format.raw/*12.46*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(compForm("compName"))),format.raw/*13.48*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(compForm("slaTime"))),format.raw/*14.47*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(compForm("slaPercentage"))),format.raw/*15.53*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(compForm("currentSlaPercentage"))),format.raw/*16.60*/("""
        """),format.raw/*17.9*/("""<button type="submit">Create Company</button>

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
object createComp extends createComp_Scope0.createComp
              /*
                  -- GENERATED --
                  DATE: Wed Aug 14 12:12:41 CEST 2019
                  SOURCE: C:/Test/de.idnow.example/app/views/createComp.scala.html
                  HASH: dd707cca741ebd3db7979fd0a5ee3b585871ab3e
                  MATRIX: 762->1|883->27|911->29|1029->122|1043->128|1101->178|1140->180|1179->192|1194->198|1245->228|1282->238|1297->244|1350->276|1387->286|1402->292|1454->323|1491->333|1506->339|1564->376|1601->386|1616->392|1681->436|1717->445|1799->497|1828->499
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|50->19|51->20
                  -- GENERATED --
              */
          