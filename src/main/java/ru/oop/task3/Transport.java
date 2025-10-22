package ru.oop.task3;

/**
 * Транспортное средство для перемещения человека в пункт назначения
 */
public interface Transport extends Positioned {
    /**
     * Довезти человка по возможности до указанной точки
     */
    void drive(Person person, Position destination);
}
