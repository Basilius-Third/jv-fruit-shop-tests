package core.basesyntax.service;

import core.basesyntax.strategy.OperationHandler;

public interface Strategy {
    OperationHandler get(String line);
}
