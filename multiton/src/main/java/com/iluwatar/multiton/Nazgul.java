/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.multiton;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Nazgul is a Multiton class. Nazgul instances can be queried using {@link #getInstance} method.
 *
 */
public enum Nazgul {
  // List of Nazgul instances
  KHAMUL("KHAMUL"),
  MURAZOR("MURAZOR"),
  DWAR("DWAR"),
  JI_INDUR("JI_INDUR"),
  AKHORAHIL("AKHORAHIL"),
  HOARMURATH("HOARMURATH"),
  ADUNAPHEL("ADUNAPHEL"),
  REN("REN"),
  UVATHA("UVATHA");
  //
  private String name;
  private static final Map<String,Nazgul> names = new HashMap<>(Nazgul.values().length);
  static {
    for(Nazgul nazgul : Nazgul.values()) {
      names.put(nazgul.getName(),nazgul);
    }
  }

  Nazgul(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Nazgul summonNazgulByName(String name){
    return names.get(name);
  }

}
