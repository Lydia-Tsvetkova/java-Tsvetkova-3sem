module ru.spbu.arts.javafx {
    requires javafx.base; // ������ ������, ������� ����������
    requires javafx.graphics;
    requires javafx.controls;

    //��������� ���������� javafx ����������� ���������� ������ ������ � �����
    opens ru.spbu.arts.javafx;
    opens ru.spbu.arts.javafx.images;

}