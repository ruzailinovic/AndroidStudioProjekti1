package com.example.android.java;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
/**
 * metoda koja prikazuje naruđbu naručene kave.
 */
public class MainActivity extends ActionBarActivity {
    int brojKava = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * metoda se poziva pritiskom na dugme.
     */
    public void submitOrder(View view) {
        display(brojKava);
        displayPrice(7 * brojKava);
    }
    /**
     * metoda koja prikazuje količinu na ekranu.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * metoda koja prikazuje cijenu na ekranu.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * metoda za dugme plus.
     */
    public void increment(View view) {
        brojKava = brojKava +1;
        display(brojKava);
    }

    /**
     * metoda za dugme minus.
     */


    public void decrement(View view) {
        brojKava = brojKava -1;
        display(brojKava);
    }
}