# ���������� ������� ���������� ������
### *��������� ���������������� ����� ����� �� ������ ������*
## ������� ������
### ������ ������������ ����� ������ �� ������� ������
```java
  public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```
## �������������
### ���������� ������ ������ � ������� �� ��������
`int[] sales = {1, 2, 3, 4, 0};`
## ���������
`������������ �����: 4`