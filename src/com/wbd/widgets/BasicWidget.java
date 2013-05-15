package com.wbd.widgets;

import com.dinaa.ui.UimData;
import com.dinaa.ui.UimHelper;

import tooltwist.wbd.CodeInserterList;
import tooltwist.wbd.JavascriptCodeInserter;
import tooltwist.wbd.WbdException;
import tooltwist.wbd.WbdGenerator;
import tooltwist.wbd.WbdRenderHelper;
import tooltwist.wbd.WbdWidget;
import tooltwist.wbd.WbdWidgetController;


public class BasicWidget extends WbdWidgetController {

	@Override
	protected void init(WbdWidget instance) throws WbdException {
		// TODO Add property initialization here
	}

	@Override
	public void renderForDesigner(WbdGenerator generator, WbdWidget instance, UimData ud, WbdRenderHelper rh) throws WbdException {
		rh.append("renderForDesigner called");
	}

	@Override
	public void renderForPreview(WbdGenerator generator, WbdWidget instance, UimData ud, WbdRenderHelper rh) throws WbdException {
		rh.append("renderForPreview called");
	}

	@Override
	public String getLabel(WbdWidget instance) throws WbdException {
		return "WBD Basic Widget";
	}

	@Override
	public void renderForJSP(WbdGenerator generator, WbdWidget instance, UimHelper ud, WbdRenderHelper rh) throws Exception {
		rh.append("renderForJSP called");
	}

	@Override
	public void getCodeInserters(WbdGenerator generator, WbdWidget instance, UimData ud, CodeInserterList codeInserterList) throws WbdException {
		// TODO Add all snippets (JSP/CSS/JSP) and Imports/Classes here
	}

}
