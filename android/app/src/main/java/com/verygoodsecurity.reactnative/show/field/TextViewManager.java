package com.verygoodsecurity.reactnative.show.field;

import android.content.res.Resources;

import androidx.annotation.Nullable;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.verygoodsecurity.reactnative.show.VGSShowOnCreateViewInstanceListener;
import com.verygoodsecurity.reactnative.util.ResourceUtil;
import com.verygoodsecurity.vgsshow.widget.VGSTextView;

import kotlin.text.Regex;

public class TextViewManager extends ViewGroupManager<VGSTextView> {

    private VGSTextView textView;

    private VGSShowOnCreateViewInstanceListener listener;

    @Nullable
    private Regex transformationRegex;

    @Nullable
    private String transformationReplacement;

    TextViewManager(VGSShowOnCreateViewInstanceListener listener) {
        super();
        this.listener = listener;
    }

    @Override
    public String getName() {
        return "VGSTextView";
    }

    @ReactProp(name = "contentPath")
    public void setContentPath(VGSTextView view, String text) {
        view.setContentPath(text);
    }

    @ReactProp(name = "transformationRegex")
    public void setTransformationRegex(VGSTextView view, String regex) {
        transformationRegex = new Regex(regex);
        if (transformationReplacement != null) {
            view.addTransformationRegex(transformationRegex, transformationReplacement);
        }
    }

    @ReactProp(name = "transformationReplacement")
    public void setTransformationReplacement(VGSTextView view, String replacement) {
        transformationReplacement = replacement;
        if (transformationRegex != null) {
            view.addTransformationRegex(transformationRegex, replacement);
        }
    }

    @ReactProp(name = "padding")
    public void setPadding(VGSTextView view, int padding) {
        int paddingDp = ResourceUtil.convertPxToDp(view.getContext(), padding);
        view.setPadding(paddingDp, paddingDp, paddingDp, paddingDp);
    }

    @ReactProp(name = "fontSize")
    public void setFontSize(VGSTextView view, int size) {
        view.setTextSize(size * Resources.getSystem().getDisplayMetrics().density);
    }

    @ReactProp(name = "hint")
    public void setHint(VGSTextView view, String text) {
        view.setHint(text);
    }

    @Override
    protected VGSTextView createViewInstance(ThemedReactContext reactContext) {
        textView = new VGSTextView(reactContext);

        listener.onCreateViewInstance(textView);

        return textView;
    }

    public String getContentPath() {
        if (textView == null) {
            return "";
        } else {
            return textView.getContentPath();
        }
    }
}