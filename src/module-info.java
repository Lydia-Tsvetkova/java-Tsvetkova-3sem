module ru.spbu.arts.javafx {
    requires javafx.base; // ������ ������, ������� ����������
    requires javafx.graphics;
    requires javafx.controls;
    requires java.management;

    //��������� ���������� javafx ����������� ���������� ������ ������ � �����
    opens ru.spbu.arts.javafx;
    opens ru.spbu.arts.javafx.images;
    opens ru.spbu.arts.fractals;

}