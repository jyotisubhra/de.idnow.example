
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createIdnt_Scope0 {
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

class createIdnt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Identification],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(identForm : Form[Identification]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		<title>Create Identification</title>
	</head>
	<body>
		<h1>Create Identification</h1>
		"""),_display_(/*9.4*/helper/*9.10*/.form(action = routes.RestController.startIdentification())/*9.69*/ {_display_(Seq[Any](format.raw/*9.71*/("""


        """),_display_(/*12.10*/helper/*12.16*/.inputText(identForm("idntId"))),format.raw/*12.47*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(identForm("compId"))),format.raw/*13.47*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(identForm("idntName"))),format.raw/*14.49*/("""
        """),format.raw/*15.9*/("""<button type="submit">Create Identification</button>

    """)))}),format.raw/*17.6*/("""
	"""),format.raw/*18.2*/("""</body>
</html>

"""))
      }
    }
  }

  def render(identForm:Form[Identification]): play.twirl.api.HtmlFormat.Appendable = apply(identForm)

  def f:((Form[Identification]) => play.twirl.api.HtmlFormat.Appendable) = (identForm) => apply(identForm)

  def ref: this.type = this

}


}

/**/
object createIdnt extends createIdnt_Scope0.createIdnt
              /*
                  -- GENERATED --
                  DATE: Wed Aug 14 12:12:41 CEST 2019
                  SOURCE: C:/Test/de.idnow.example/app/views/createIdnt.scala.html
                  HASH: 665a5b218eba4fef588d419120551bf9154652d0
                  MATRIX: 769->1|898->35|926->37|1058->144|1072->150|1139->209|1178->211|1217->223|1232->229|1284->260|1321->270|1336->276|1388->307|1425->317|1440->323|1494->356|1530->365|1619->424|1648->426
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|48->17|49->18
                  -- GENERATED --
              */
          