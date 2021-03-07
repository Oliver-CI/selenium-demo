import { myComponentStyles } from './my-component.styles.js';
import { myComponentTemplate } from './my-component.template.js';

customElements.define('my-component', class extends HTMLElement {
	constructor() {
		super();
		this.attachShadow({ mode: 'open' });
	}
	connectedCallback() {
		this.shadowRoot.innerHTML = `
			${myComponentStyles}
			${myComponentTemplate}
		`;
	}
});