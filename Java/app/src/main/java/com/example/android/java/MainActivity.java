package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.java.R;

import java.text.NumberFormat;
/**
 * metoda koja prikazuje naruđbu naručene kave.
 */
public class MainActivity extends ActionBarActivity {
    int kolicina = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * metoda se poziva pritiskom na dugme.
     */
    public void submitOrders(View view) {

        racunanjeCijene(kolicina, 6);
    }

    /**
     * metoda koja prikazuje količinu na ekranu.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }



    /**
     * Računanje cijene naruđbe .
     *
     * @param kolicina je broj naručenih kava
     */



    private void racunanjeCijene(int kolicina, int cijena) {
        int cijena1 = kolicina * cijena;
        displayPrice(cijena1);
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
        kolicina = kolicina + 1;
        display(kolicina);
    }

    /**
     * metoda za dugme minus.
     */
    public void decrement(View view) {
        kolicina = kolicina - 1;
        display(kolicina);
    }

}