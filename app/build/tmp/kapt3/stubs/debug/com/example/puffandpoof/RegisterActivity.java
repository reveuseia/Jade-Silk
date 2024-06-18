package com.example.puffandpoof;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.puffandpoof.Fragment.ProfileFragment;
import com.example.puffandpoof.databinding.ActivityRegisterBinding;
import com.example.puffandpoof.model.profile;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J(\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J(\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/puffandpoof/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/puffandpoof/databinding/ActivityRegisterBinding;", "sharedPreferences", "Landroid/content/SharedPreferences;", "textWatcher", "Landroid/text/TextWatcher;", "checkFields", "", "isUsernameUnique", "", "username", "", "navigateToLogin", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveUserInfo", "email", "password", "phoneNumber", "showToast", "message", "validateFields", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.puffandpoof.databinding.ActivityRegisterBinding binding;
    private android.content.SharedPreferences sharedPreferences;
    private final android.text.TextWatcher textWatcher = null;
    
    public RegisterActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean validateFields(java.lang.String username, java.lang.String email, java.lang.String password, java.lang.String phoneNumber) {
        return false;
    }
    
    private final boolean isUsernameUnique(java.lang.String username) {
        return false;
    }
    
    private final void saveUserInfo(java.lang.String username, java.lang.String email, java.lang.String password, java.lang.String phoneNumber) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void checkFields() {
    }
    
    private final void navigateToLogin() {
    }
}