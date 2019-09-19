package de.bkb.vaadin;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("label-more")
@JsModule("label-more/label-more.js")
@NpmPackage(value = "label-more", version = "1.0.2")
/*
 * If you wish to include your own JS modules in the add-on jar, add the module
 * files to './src/main/resources/META-INF/resources/frontend' and insert an
 * annotation @JsModule("./my-module.js") here.
 */
/**
 * Vaadin based UI component which shows a text / html. If the text / html
 * overflows the given content area (set by contentHeight) a "More"-Button will
 * be shown to expand the content area to fit the content.
 * 
 * @author BKB
 *
 */
public class LabelMore extends Component {


	/**
	 * Set the height of the content area.
	 * @param contentHeight The content height in px
	 */
	public void setContentHeight(String contentHeight) {
		getElement().setProperty("contentheight", contentHeight);
	}

	/**
	 * Sets the expanded state.
	 * @param expanded True the text / html is visible.
	 */
	public void setExpanded(Boolean expanded) {
		getElement().setProperty("expanded", expanded);
	}

	/**
	 * Sets alternative captions for the "More"- / "Less"-Buttons.
	 * @param readMore The caption for the "More"-Button.
	 * @param readLess The caption for the "Less"-Button.
	 */
	public void setButtonCaptions(String readMore, String readLess) {
		getElement().setProperty("readmorecaption", readMore);
		getElement().setProperty("readlesscaption", readLess);
	}

	/**
	 * Sets the text / html to show.
	 * @param html The text / html to show.
	 */
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
