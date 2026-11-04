
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // دریافت اطلاعات از کاربر
        System.out.print("حجم بسته اینترنت را وارد کنید (گیگابایت): ");
        double volume = Double.parseDouble(input.nextLine());

        System.out.print("موجودی کیف پول خود را وارد کنید (تومان): ");
        double balance = Double.parseDouble(input.nextLine());

        // بررسی معتبر بودن اطلاعات
        if (volume <= 0 || balance < 0) {
            System.out.println("حجم بسته یا موجودی واردشده نامعتبر است.");
        } else {

            // محاسبه قیمت بسته
            double price = volume * 5000;

            // بررسی تخفیف
            if (volume > 10) {
                price = price * 0.85;
            }

            // بررسی موجودی کیف پول
            if (balance >= price) {
                double remaining = balance - price;

                System.out.println("خرید با موفقیت انجام شد.");
                System.out.println("موجودی باقی‌مانده: " + remaining + " تومان");
            } else {
                double shortage = price - balance;

                System.out.println("موجودی کاربر کافی نیست.");
                System.out.println("مبلغ کسری: " + shortage + " تومان");
            }
        }

        input.close();
    }
}
