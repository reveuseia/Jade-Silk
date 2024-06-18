package com.example.puffandpoof;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Glide;
import com.example.puffandpoof.Fragment.TransactionFragment;
import object.Transactionlist;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0015J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u000e\u0010!\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u000e\u0010&\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010\u00a8\u00060"}, d2 = {"Lcom/example/puffandpoof/DetailDollActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ImageView", "Landroid/widget/ImageView;", "addToCartButton", "Landroid/widget/Button;", "getAddToCartButton", "()Landroid/widget/Button;", "setAddToCartButton", "(Landroid/widget/Button;)V", "brandd", "Landroid/widget/TextView;", "getBrandd", "()Landroid/widget/TextView;", "setBrandd", "(Landroid/widget/TextView;)V", "brandq", "", "button", "desc", "descc", "getDescc", "setDescc", "quantityPicker", "Landroid/widget/NumberPicker;", "getQuantityPicker", "()Landroid/widget/NumberPicker;", "setQuantityPicker", "(Landroid/widget/NumberPicker;)V", "ratingg", "getRatingg", "setRatingg", "ratingz", "sizeq", "sizez", "getSizez", "setSizez", "tittle", "ttl", "getTtl", "setTtl", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showToast", "message", "app_debug"})
public final class DetailDollActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.TextView ttl;
    public android.widget.TextView ratingg;
    public android.widget.TextView sizez;
    public android.widget.TextView descc;
    public android.widget.TextView brandd;
    public android.widget.Button addToCartButton;
    public android.widget.NumberPicker quantityPicker;
    private android.widget.ImageView ImageView;
    private android.widget.Button button;
    private java.lang.String tittle = "";
    private java.lang.String ratingz = "";
    private java.lang.String brandq = "";
    private java.lang.String sizeq = "";
    private java.lang.String desc = "";
    
    public DetailDollActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTtl() {
        return null;
    }
    
    public final void setTtl(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getRatingg() {
        return null;
    }
    
    public final void setRatingg(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getSizez() {
        return null;
    }
    
    public final void setSizez(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getDescc() {
        return null;
    }
    
    public final void setDescc(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBrandd() {
        return null;
    }
    
    public final void setBrandd(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getAddToCartButton() {
        return null;
    }
    
    public final void setAddToCartButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.NumberPicker getQuantityPicker() {
        return null;
    }
    
    public final void setQuantityPicker(@org.jetbrains.annotations.NotNull()
    android.widget.NumberPicker p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String message) {
    }
}