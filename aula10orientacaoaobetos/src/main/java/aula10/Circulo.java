/*
 * Copyright (C) 2024 Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package aula10;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 15/03/2024
 * @brief Class Circulo
 */
public class Circulo extends Figura {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public Circulo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", cor=" + super.getCor() + "]";
    }

    @Override
    public double area() {
        return raio * 3.14 * 2;
    }
}
