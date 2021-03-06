package com.example.routersever.controller.context;

import com.example.routersever.controller.context.IContext.IContext;
import com.example.routersever.controller.context.IContextFactory.IContextFactory;

/**
 * Created by Canghaixiao.
 * Time : 2018/6/2 10:13.
 * Function :
 */
public class ContextFactoryImpl implements IContextFactory {

    private static class Factory {
        private static ContextFactoryImpl mInstance = new ContextFactoryImpl();
    }

    public static IContextFactory getFactory() {
        return Factory.mInstance;
    }

    @Override
    public IContext getContextCache() {
        return ContextImpl.getInstance();
    }
}
