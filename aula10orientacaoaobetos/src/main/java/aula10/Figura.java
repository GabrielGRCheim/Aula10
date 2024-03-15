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
 * @brief Class Figura
 */
public abstract class Figura {
    private String cor;
    public Figura() {
        
    }
    public Figura(String cor){
        super();
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void steCor(String cor){
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Figura [ cor=" + cor + "]";
    }
    
    public abstract double area();
}

