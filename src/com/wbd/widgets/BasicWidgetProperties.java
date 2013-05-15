package com.wbd.widgets;

import com.dinaa.ui.UimData;
import com.dinaa.ui.UimHelper;

import tooltwist.wbd.CodeInserterList;
import tooltwist.wbd.WbdException;
import tooltwist.wbd.WbdGenerator;
import tooltwist.wbd.WbdRenderHelper;
import tooltwist.wbd.WbdStringProperty;
import tooltwist.wbd.WbdWidget;
import tooltwist.wbd.WbdWidgetController;
import tooltwist.wbd.WidgetHelper;


public class BasicWidgetProperties extends WbdWidgetController {

    @Override
    protected void init(WbdWidget instance) throws WbdException {
           
           instance.defineProperty(new WbdStringProperty("text", null, "TEXT", "Textvalue"));
    }

    @Override
    public void renderForDesigner(WbdGenerator generator, WbdWidget instance, UimData ud, WbdRenderHelper rh) throws WbdException {
           renderWidget(generator, instance, rh);
    }

    @Override
    public void renderForPreview(WbdGenerator generator, WbdWidget instance, UimData ud, WbdRenderHelper rh) throws WbdException {
           renderWidget(generator, instance, rh);
    } 

    @Override
    public String getLabel(WbdWidget instance) throws WbdException {
           return "WBD Basic Widget";
    }

    @Override
    public void renderForJSP(WbdGenerator generator, WbdWidget instance, UimHelper ud, WbdRenderHelper rh) throws Exception {
           renderWidget(generator, instance, rh);
    }

    @Override
    public void getCodeInserters(WbdGenerator generator, WbdWidget instance, UimData ud, CodeInserterList codeInserterList) throws WbdException {
           // TODO Add all snippets (JSP/CSS/JSP) and Imports/Classes here
    }
    
    private void renderWidget(WbdGenerator generator, WbdWidget instance, WbdRenderHelper buf) throws WbdException {
           try {
                  String title = WidgetHelper.getDefaultIfEmpty(instance.getFinalProperty(generator, "text"), "Text");

                  buf.append(title);
                  
           } catch (Exception ex) {
                  throw new WbdException("Error encountered on rendering widget: (" + ex.toString() + ")");
           }
    }
    

}
