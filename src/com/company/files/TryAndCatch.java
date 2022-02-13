package com.company.files;

public class TryAndCatch {
    public static void main(String[] args) {
        System.out.println("Start program");

        try {
            System.out.println("Start Try");
            int a = 10 / 0;
//            String message = null;
//            message.length();
        }
        //   catch - ловим исключение,
        //    ArithmeticException - тип исключения, "are" - имя
        catch (ArithmeticException are) {
            System.out.println("Start ARE catch");
            //  printStackTrace() - выводим метод логирования, печатаем путь к Exception
            are.printStackTrace();
            //   getLocalizedMessage() - Создает локализованное описание этого обьекта
            System.out.println(are.getLocalizedMessage());
            // getMessage() -  вывести сообщение  ошибки
            System.out.println(are.getMessage());
        }
        //  catch (ArithmeticException | NullPointerException are)  - если реакция на два исключения одинаковая
        catch (NullPointerException npe) {
            //  реакция программы на исключение
            System.out.println("Start NPE catch");
            npe.printStackTrace();
        }
        //  по иерархии исключений, если верхние убрать, а оставить  Exception, то он отловит все исключения
        catch (Exception e) {
            System.out.println("Start E catch");
            e.printStackTrace();
            System.out.println("Start E");
        }
        //   finally - код выполнится в любом случае
        finally {
            System.out.println("Start FINALLY");
            System.out.println("End FINALLY");
        }
    }
}
