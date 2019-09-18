package de.bkb.vaadin;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("label-more-lit")
@JsModule("label-more-lit/label-more-lit.js")
@NpmPackage(value = "label-more-lit", version = "1.0.0")
/*
 If you wish to include your own JS modules in the add-on jar, add the module
 files to './src/main/resources/META-INF/resources/frontend' and insert an
 annotation @JsModule("./my-module.js") here.
*/
public class LabelMore extends Component {

	public LabelMore() {
	}
	
	public void setContentHeight(String contentHeight) {
		getElement().setProperty("contentheight", contentHeight);
	}
	
	public void setButtonCaptions(String readMore, String readLess) {
		getElement().setProperty("readmorecaption", readMore);
		getElement().setProperty("readlesscaption", readLess);
	}
	
	public void setHtml(String html) {
		StringBuffer htmlBuffer = new StringBuffer();
		htmlBuffer.append("<div>");
		htmlBuffer.append(html);
		htmlBuffer.append("</div>");
		Html htmlComp = new Html(htmlBuffer.toString());
		getElement().removeAllChildren();
		getElement().appendChild(htmlComp.getElement());
	}

}
