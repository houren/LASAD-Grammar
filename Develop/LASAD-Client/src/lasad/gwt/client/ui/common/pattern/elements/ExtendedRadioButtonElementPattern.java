package lasad.gwt.client.ui.common.pattern.elements;

import java.util.Vector;

import lasad.gwt.client.model.ElementInfo;
import lasad.gwt.client.ui.common.ExtendedElementContainerInterface;
import lasad.gwt.client.ui.common.elements.AbstractExtendedRadioButtonElement;

public class ExtendedRadioButtonElementPattern extends
		AbstractExtendedRadioButtonElement {
	
	public ExtendedRadioButtonElementPattern(boolean readonly,
			ExtendedElementContainerInterface container, ElementInfo config) {
		super(readonly, container, config);
	}

	public ExtendedRadioButtonElementPattern(
			ExtendedElementContainerInterface container, ElementInfo config,
			boolean _mode) {
		super(container, config, _mode);
	}

	@Override
	public void updateElementWithMultipleValues(String mapID, int id,
			Vector<Object[]> values) {
		//Nothing to do
	}

}
