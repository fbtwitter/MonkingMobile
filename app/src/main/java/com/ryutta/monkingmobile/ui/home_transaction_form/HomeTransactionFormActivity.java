package com.ryutta.monkingmobile.ui.home_transaction_form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.ryutta.monkingmobile.R;

public class HomeTransactionFormActivity extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    ConstraintLayout cashInLayout;
    ConstraintLayout cashOutLayout;
    ConstraintLayout debtLayout;
    ConstraintLayout loanLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_transaction_form);

        ImageButton menuButton = findViewById(R.id.ib_menu_transactionForm);
        menuButton.setOnClickListener(this);

        ImageView backButton = findViewById(R.id.iv_form_back);
        backButton.setOnClickListener(this);

        cashInLayout = findViewById(R.id.constrain_form_cashIn_layerInherit);
        cashOutLayout = findViewById(R.id.constrain_form_cashOut_layerInherit);
        debtLayout = findViewById(R.id.constrain_form_debt_layerInherit);
        loanLayout = findViewById(R.id.constrain_form_loan_layerInherit);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_menu_transactionForm:
                PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
                popupMenu.setOnMenuItemClickListener(this);
                popupMenu.inflate(R.menu.transaction_form_menu);
                popupMenu.show();
                break;
            case R.id.iv_form_back:
                onBackPressed();
                break;
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.transaction_form_cash_in:
                cashInLayout.setVisibility(View.VISIBLE);
                cashOutLayout.setVisibility(View.GONE);
                debtLayout.setVisibility(View.GONE);
                loanLayout.setVisibility(View.GONE);

                return true;
            case R.id.transaction_form_cash_out:
                cashInLayout.setVisibility(View.GONE);
                cashOutLayout.setVisibility(View.VISIBLE);
                debtLayout.setVisibility(View.GONE);
                loanLayout.setVisibility(View.GONE);
                return true;
            case R.id.transaction_form_debt:
                cashInLayout.setVisibility(View.GONE);
                cashOutLayout.setVisibility(View.GONE);
                debtLayout.setVisibility(View.VISIBLE);
                loanLayout.setVisibility(View.GONE);
                return true;
            case R.id.transaction_form_loan:
                cashInLayout.setVisibility(View.GONE);
                cashOutLayout.setVisibility(View.GONE);
                debtLayout.setVisibility(View.GONE);
                loanLayout.setVisibility(View.VISIBLE);
                return true;
            default:
                return false;
        }
    }

    public void setVisibility(){

    }
}