package com.designPatterns.decorators;

import com.designPatterns.component.Component;

public interface Decorator extends Component {
    int getCoffeePrice();
}
