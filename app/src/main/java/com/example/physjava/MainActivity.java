package com.example.physjava;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvFact;
    private Button btnShowFacts;
    private int factCount = 0;

    private final String[] physicsFacts = {
            "Свет travels со скоростью 299,792 км/с - это самая быстрая скорость во Вселенной",
            "В вакууме все объекты падают с одинаковой скоростью, независимо от их массы",
            "Атом на 99.9% состоит из пустого пространства",
            "Земля вращается со скоростью около 1670 км/ч на экваторе",
            "Вода - единственное вещество, которое расширяется при замерзании",
            "Эйнштейн никогда не проваливал математику - это миф",
            "Молния в 5 раз горячее поверхности Солнца",
            "Человеческое тело содержит достаточно углерода для 9000 карандашей",
            "Солнечному свету требуется 8 минут чтобы достичь Земли",
            "В космосе нет звука - только полная тишина",
            "Нейтронные звезды - самые плотные объекты во Вселенной",
            "Квантовые частицы могут находиться в двух местах одновременно",
            "Вселенная на 95% состоит из темной материи и темной энергии",
            "Время замедляется near massive objects и при high speeds",
            "Энергия не создается и не уничтожается - только преобразуется",
            "Магнитное поле Земли защищает нас от solar radiation",
            "Черные дыры не всасывают matter - они искривляют space-time",
            "Квантовая entanglement позволяет частицам мгновенно влиять друг на друга",
            "Все элементарные частицы также являются волнами",
            "Вселенная постоянно расширяется и ускоряется",
            "Антиматерия - реальное вещество с противоположным charge",
            "Гравитация - самая слабая из fundamental forces",
            "Сверхпроводники могут levitate над магнитами",
            "Квантовые компьютеры используют qubits вместо bits",
            "Теория струн предполагает 11 измерений",
            "Вакуум космоса не совсем пуст - он filled with virtual particles",
            "Свет может оказывать pressure на objects (radiation pressure)",
            "Электроны могут tunnel через barriers",
            "Криогенные temperatures near absolute zero вызывают strange quantum effects",
            "Вселенная имеет background radiation от Big Bang",
            "Квантовая teleportation уже существует для particles",
            "Черные дыры eventually evaporate через Hawking radiation",
            "Время - relative concept зависит от observer's frame of reference",
            "Квантовая superposition позволяет particles быть в multiple states",
            "Вселенная может быть holographic projection",
            "Световые годы measure distance, not time",
            "Квантовая computing решает problems exponentially faster",
            "Multiverse theory suggests multiple parallel universes",
            "Квантовая cryptography обеспечивает perfect security",
            "Современная физика описывает лишь 4% всей Вселенной"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("physJava");
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        tvFact = findViewById(R.id.tvFact);
        btnShowFacts = findViewById(R.id.btnShowFacts);

        // Навигация в меню
        TextView tvNews = findViewById(R.id.tvNews);
        tvNews.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NewsActivity.class);
            startActivity(intent);
        });

        // Показ фактов
        btnShowFacts.setOnClickListener(v -> showRandomFact());
    }

    private void showRandomFact() {
        if (factCount < 40) {
            Random random = new Random();
            int index = random.nextInt(physicsFacts.length);

            tvFact.setText(physicsFacts[index]);
            tvFact.setVisibility(View.VISIBLE);

            factCount++;
            btnShowFacts.setText("Еще факт (" + factCount + "/40)");

            if (factCount >= 40) {
                btnShowFacts.setEnabled(false);
                btnShowFacts.setText("Все факты показаны");
            }
        }
    }
}