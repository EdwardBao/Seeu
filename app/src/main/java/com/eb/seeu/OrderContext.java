package com.eb.seeu;

import android.content.Context;


public class OrderContext {
    private static OrderContext instance;

    private Context applicationContext;

    public static OrderContext getInstance() {
        if (instance == null){
            throw new RuntimeException(OrderContext.class.getSimpleName() + "has not been initialized!");
        }

        return instance;
    }

    public Context getApplicationContext() {
        return applicationContext;
    }

    public OrderContext(Context applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void init(Context applicationContext) {
        if (instance != null) {
            throw new RuntimeException(OrderContext.class.getSimpleName() + " can not be initialized multiple times!");
        }
        instance = new OrderContext(applicationContext);
    }

    public static boolean isInitialized() {
        return (instance != null);
    }
}
