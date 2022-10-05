public class exercicio41 {
    InitializeComponent();
}

private void button1_Click(object sender, EventArgs e)
{
    int peso = 0, altura = 0;

    try
    {
        peso = Convert.ToInt32(textBox2.Text);
        altura = Convert.ToInt32(textBox1.Text);
    }

    catch
    {
        MessageBox.Show("Valor Inválido");
        return;
    }

    int p1 = peso-50;
    int p2 = peso-70;
    int p3 = peso-100;

    if (altura < 1.50)
    {
        if (peso == 50)
        {
            label4.Text = "Peso Ideal";
        }
        else
            if (peso > 50)
            {
                label4.Text = ("Emagreça " + p1 + "Kg");
            }
            else
                if (peso < 50)
                {
                    label4.Text = ("Engorde " + p1 + "Kg");
                }
    }
    else
    if ((altura >= 1.50) && (altura <= 1.90))
    {
        if (peso == 70)
        {
            label4.Text = "Peso Ideal";
        }
        else
            if (peso > 70)
            {
                label4.Text = ("Emagreça " + p2 + "Kg");
            }
            else
                if (peso < 70)
                {
                    label4.Text = ("Engorde " + p2 + "Kg");
                }
    }
    else
    if (altura > 1.90)
    {
        if (peso == 100)
        {
            label4.Text = "Peso ideal";
        }
        else
            if (peso > 100)
            {
                label4.Text = ("Emagreça " + p3 + "Kg");
            }
            else
                if (peso < 100)
                {
                    label4.Text = ("Engorde " + p3 + "Kg");
                }
    }
}
}
}
}
