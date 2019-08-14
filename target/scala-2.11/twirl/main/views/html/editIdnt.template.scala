
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editIdnt_Scope0 {
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

class editIdnt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Identification],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(identForm : Form[Identification]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		<title>Update Identification</title>
	</head>
	<body>
		<h1>Update Identification</h1>
		"""),_display_(/*9.4*/helper/*9.10*/.form(action = routes.RestController.updateIdentification())/*9.70*/ {_display_(Seq[Any](format.raw/*9.72*/("""


        """),_display_(/*12.10*/helper/*12.16*/.inputText(identForm("idntId"))),format.raw/*12.47*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(identForm("compId"))),format.raw/*13.47*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(identForm("idntName"))),format.raw/*14.49*/("""
        """),format.raw/*15.9*/("""<button type="submit">Update Identification</button>

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
object editIdnt extends editIdnt_Scope0.editIdnt
              /*
                  -- GENERATED --
                  DATE: Wed Aug 14 12:12:41 CEST 2019
                  SOURCE: C:/Test/de.idnow.example/app/views/editIdnt.scala.html
                  HASH: 76fc8e7016ec05d2965c04cac84ed28c39e64e48
                  MATRIX: 765->1|894->35|922->37|1054->144|1068->150|1136->210|1175->212|1214->224|1229->230|1281->261|1318->271|1333->277|1385->308|1422->318|1437->324|1491->357|1527->366|1616->425|1645->427
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|48->17|49->18
                  -- GENERATED --
              */
          