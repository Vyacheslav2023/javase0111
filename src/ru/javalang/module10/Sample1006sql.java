package ru.javalang.module10;

import java.sql.*;

public class Sample1006sql {
    public static void main(String[] args) {

        //Объявления переменных для создания соединения и получения результатов
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;

        try{
            //Запрос класса по имени
            Class.forName("org.sqlite.JDBC");

//            DriverManager.registerDriver(new org.sqlite.JDBC());

            //Установление соединения
            connection = DriverManager.getConnection("jdbc:sqlite:car.s3db");
//            connection = DriverManager.getConnection("jdbc:sqlite:C:\\test\\car.s3db");

            //Создание экземпляра для выполнения запросов (без параметров)
            statement = connection.createStatement();


            //1.Удаление всех данных из базы
            statement.executeUpdate("DELETE FROM CAR WHERE id >= 0");

            //2. Вставка данных в базу
            statement.executeUpdate("INSERT INTO car values (1,'TOYOTA')");
            statement.executeUpdate("INSERT INTO car values (2,'NISSAN')");
            statement.executeUpdate("INSERT INTO car values (3,'SUBARY')");

            //3. Запорос на выборку данных
            resultSet = statement.executeQuery("select * from car");

            //3.1. Получение количества полей
            int n = resultSet.getMetaData().getColumnCount();
            System.out.println("количество полей: " + n);
            for (int i = 1; i <= n; i++) {
                System.out.print(resultSet.getMetaData().getColumnLabel(i) + "\t");
            }
            System.out.println();


            //3.2. Получение значений:
            //а) Сначала выбираются записи (строки), пока они есть
            //б) Выбираются значения по полям (стобцам)
            while (resultSet.next()){
                for (int i = 1; i <= n; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }

            // 4. Обновление записей
            statement.executeUpdate("update car set name='SUZUKI' where id=3");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
