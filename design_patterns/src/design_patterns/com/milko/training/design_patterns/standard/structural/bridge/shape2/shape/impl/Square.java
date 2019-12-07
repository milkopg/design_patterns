package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.shape.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.api.Color;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.shape.base.Shape;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}
}
