module ru.spbu.arts.javafx {
    requires javafx.base; // ������ ������, ������� ����������
    requires javafx.graphics;
    requires javafx.controls;

    //��������� ���������� javafx ����������� ���������� ������ ������ � �����
    opens ru.spbu.arts.java.messenger;
    opens ru.spbu.arts.java.button;

}