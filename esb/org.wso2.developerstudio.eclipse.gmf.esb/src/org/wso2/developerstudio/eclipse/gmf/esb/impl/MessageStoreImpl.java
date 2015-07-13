/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.JMSSpecVersion;
import org.wso2.developerstudio.eclipse.gmf.esb.MessageStore;
import org.wso2.developerstudio.eclipse.gmf.esb.MessageStoreParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.MessageStoreType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getStoreType <em>Store Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getInitialContextFactory <em>Initial Context Factory</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getProviderURL <em>Provider URL</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getJndiQueueName <em>Jndi Queue Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getConnectionFactory <em>Connection Factory</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getJmsSpecVersion <em>Jms Spec Version</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#isEnableCaching <em>Enable Caching</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getProviderClass <em>Provider Class</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getRabbitMQServerHostName <em>Rabbit MQ Server Host Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getRabbitMQServerHostPort <em>Rabbit MQ Server Host Port</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getRabbitMQQueueName <em>Rabbit MQ Queue Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getRabbitMQExchangeName <em>Rabbit MQ Exchange Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getRoutingKey <em>Routing Key</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getRabbitMQUserName <em>Rabbit MQ User Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getRabbitMQPassword <em>Rabbit MQ Password</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getVirtualHost <em>Virtual Host</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.MessageStoreImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageStoreImpl extends EsbElementImpl implements MessageStore {
	/**
	 * The default value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected String storeName = STORE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreType() <em>Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageStoreType STORE_TYPE_EDEFAULT = MessageStoreType.IN_MEMORY;

	/**
	 * The cached value of the '{@link #getStoreType() <em>Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreType()
	 * @generated
	 * @ordered
	 */
	protected MessageStoreType storeType = STORE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialContextFactory() <em>Initial Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialContextFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_CONTEXT_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialContextFactory() <em>Initial Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialContextFactory()
	 * @generated
	 * @ordered
	 */
	protected String initialContextFactory = INITIAL_CONTEXT_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderURL() <em>Provider URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderURL()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderURL() <em>Provider URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderURL()
	 * @generated
	 * @ordered
	 */
	protected String providerURL = PROVIDER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiQueueName() <em>Jndi Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiQueueName()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_QUEUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiQueueName() <em>Jndi Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiQueueName()
	 * @generated
	 * @ordered
	 */
	protected String jndiQueueName = JNDI_QUEUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionFactory() <em>Connection Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionFactory() <em>Connection Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionFactory()
	 * @generated
	 * @ordered
	 */
	protected String connectionFactory = CONNECTION_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getJmsSpecVersion() <em>Jms Spec Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmsSpecVersion()
	 * @generated
	 * @ordered
	 */
	protected static final JMSSpecVersion JMS_SPEC_VERSION_EDEFAULT = JMSSpecVersion.JMS_11;

	/**
	 * The cached value of the '{@link #getJmsSpecVersion() <em>Jms Spec Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJmsSpecVersion()
	 * @generated
	 * @ordered
	 */
	protected JMSSpecVersion jmsSpecVersion = JMS_SPEC_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableCaching() <em>Enable Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableCaching()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_CACHING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableCaching() <em>Enable Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableCaching()
	 * @generated
	 * @ordered
	 */
	protected boolean enableCaching = ENABLE_CACHING_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderClass() <em>Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderClass() <em>Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderClass()
	 * @generated
	 * @ordered
	 */
	protected String providerClass = PROVIDER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRabbitMQServerHostName() <em>Rabbit MQ Server Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQServerHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String RABBIT_MQ_SERVER_HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRabbitMQServerHostName() <em>Rabbit MQ Server Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQServerHostName()
	 * @generated
	 * @ordered
	 */
	protected String rabbitMQServerHostName = RABBIT_MQ_SERVER_HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRabbitMQServerHostPort() <em>Rabbit MQ Server Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQServerHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final String RABBIT_MQ_SERVER_HOST_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRabbitMQServerHostPort() <em>Rabbit MQ Server Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQServerHostPort()
	 * @generated
	 * @ordered
	 */
	protected String rabbitMQServerHostPort = RABBIT_MQ_SERVER_HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRabbitMQQueueName() <em>Rabbit MQ Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQQueueName()
	 * @generated
	 * @ordered
	 */
	protected static final String RABBIT_MQ_QUEUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRabbitMQQueueName() <em>Rabbit MQ Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQQueueName()
	 * @generated
	 * @ordered
	 */
	protected String rabbitMQQueueName = RABBIT_MQ_QUEUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRabbitMQExchangeName() <em>Rabbit MQ Exchange Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQExchangeName()
	 * @generated
	 * @ordered
	 */
	protected static final String RABBIT_MQ_EXCHANGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRabbitMQExchangeName() <em>Rabbit MQ Exchange Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQExchangeName()
	 * @generated
	 * @ordered
	 */
	protected String rabbitMQExchangeName = RABBIT_MQ_EXCHANGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingKey() <em>Routing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTING_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutingKey() <em>Routing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingKey()
	 * @generated
	 * @ordered
	 */
	protected String routingKey = ROUTING_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRabbitMQUserName() <em>Rabbit MQ User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String RABBIT_MQ_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRabbitMQUserName() <em>Rabbit MQ User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQUserName()
	 * @generated
	 * @ordered
	 */
	protected String rabbitMQUserName = RABBIT_MQ_USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRabbitMQPassword() <em>Rabbit MQ Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String RABBIT_MQ_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRabbitMQPassword() <em>Rabbit MQ Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRabbitMQPassword()
	 * @generated
	 * @ordered
	 */
	protected String rabbitMQPassword = RABBIT_MQ_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualHost() <em>Virtual Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualHost()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualHost() <em>Virtual Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualHost()
	 * @generated
	 * @ordered
	 */
	protected String virtualHost = VIRTUAL_HOST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageStoreParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.MESSAGE_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreName(String newStoreName) {
		String oldStoreName = storeName;
		storeName = newStoreName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__STORE_NAME, oldStoreName, storeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageStoreType getStoreType() {
		return storeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreType(MessageStoreType newStoreType) {
		MessageStoreType oldStoreType = storeType;
		storeType = newStoreType == null ? STORE_TYPE_EDEFAULT : newStoreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__STORE_TYPE, oldStoreType, storeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialContextFactory() {
		return initialContextFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialContextFactory(String newInitialContextFactory) {
		String oldInitialContextFactory = initialContextFactory;
		initialContextFactory = newInitialContextFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__INITIAL_CONTEXT_FACTORY, oldInitialContextFactory, initialContextFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderURL() {
		return providerURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderURL(String newProviderURL) {
		String oldProviderURL = providerURL;
		providerURL = newProviderURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__PROVIDER_URL, oldProviderURL, providerURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiQueueName() {
		return jndiQueueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiQueueName(String newJndiQueueName) {
		String oldJndiQueueName = jndiQueueName;
		jndiQueueName = newJndiQueueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__JNDI_QUEUE_NAME, oldJndiQueueName, jndiQueueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionFactory() {
		return connectionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionFactory(String newConnectionFactory) {
		String oldConnectionFactory = connectionFactory;
		connectionFactory = newConnectionFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__CONNECTION_FACTORY, oldConnectionFactory, connectionFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSSpecVersion getJmsSpecVersion() {
		return jmsSpecVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJmsSpecVersion(JMSSpecVersion newJmsSpecVersion) {
		JMSSpecVersion oldJmsSpecVersion = jmsSpecVersion;
		jmsSpecVersion = newJmsSpecVersion == null ? JMS_SPEC_VERSION_EDEFAULT : newJmsSpecVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__JMS_SPEC_VERSION, oldJmsSpecVersion, jmsSpecVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableCaching() {
		return enableCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableCaching(boolean newEnableCaching) {
		boolean oldEnableCaching = enableCaching;
		enableCaching = newEnableCaching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__ENABLE_CACHING, oldEnableCaching, enableCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderClass() {
		return providerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderClass(String newProviderClass) {
		String oldProviderClass = providerClass;
		providerClass = newProviderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__PROVIDER_CLASS, oldProviderClass, providerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRabbitMQServerHostName() {
		return rabbitMQServerHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRabbitMQServerHostName(String newRabbitMQServerHostName) {
		String oldRabbitMQServerHostName = rabbitMQServerHostName;
		rabbitMQServerHostName = newRabbitMQServerHostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_NAME, oldRabbitMQServerHostName, rabbitMQServerHostName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRabbitMQServerHostPort() {
		return rabbitMQServerHostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRabbitMQServerHostPort(String newRabbitMQServerHostPort) {
		String oldRabbitMQServerHostPort = rabbitMQServerHostPort;
		rabbitMQServerHostPort = newRabbitMQServerHostPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_PORT, oldRabbitMQServerHostPort, rabbitMQServerHostPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRabbitMQQueueName() {
		return rabbitMQQueueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRabbitMQQueueName(String newRabbitMQQueueName) {
		String oldRabbitMQQueueName = rabbitMQQueueName;
		rabbitMQQueueName = newRabbitMQQueueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__RABBIT_MQ_QUEUE_NAME, oldRabbitMQQueueName, rabbitMQQueueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRabbitMQExchangeName() {
		return rabbitMQExchangeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRabbitMQExchangeName(String newRabbitMQExchangeName) {
		String oldRabbitMQExchangeName = rabbitMQExchangeName;
		rabbitMQExchangeName = newRabbitMQExchangeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__RABBIT_MQ_EXCHANGE_NAME, oldRabbitMQExchangeName, rabbitMQExchangeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoutingKey() {
		return routingKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingKey(String newRoutingKey) {
		String oldRoutingKey = routingKey;
		routingKey = newRoutingKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__ROUTING_KEY, oldRoutingKey, routingKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRabbitMQUserName() {
		return rabbitMQUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRabbitMQUserName(String newRabbitMQUserName) {
		String oldRabbitMQUserName = rabbitMQUserName;
		rabbitMQUserName = newRabbitMQUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__RABBIT_MQ_USER_NAME, oldRabbitMQUserName, rabbitMQUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRabbitMQPassword() {
		return rabbitMQPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRabbitMQPassword(String newRabbitMQPassword) {
		String oldRabbitMQPassword = rabbitMQPassword;
		rabbitMQPassword = newRabbitMQPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__RABBIT_MQ_PASSWORD, oldRabbitMQPassword, rabbitMQPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtualHost() {
		return virtualHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualHost(String newVirtualHost) {
		String oldVirtualHost = virtualHost;
		virtualHost = newVirtualHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.MESSAGE_STORE__VIRTUAL_HOST, oldVirtualHost, virtualHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageStoreParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MessageStoreParameter>(MessageStoreParameter.class, this, EsbPackage.MESSAGE_STORE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EsbPackage.MESSAGE_STORE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.MESSAGE_STORE__STORE_NAME:
				return getStoreName();
			case EsbPackage.MESSAGE_STORE__STORE_TYPE:
				return getStoreType();
			case EsbPackage.MESSAGE_STORE__INITIAL_CONTEXT_FACTORY:
				return getInitialContextFactory();
			case EsbPackage.MESSAGE_STORE__PROVIDER_URL:
				return getProviderURL();
			case EsbPackage.MESSAGE_STORE__JNDI_QUEUE_NAME:
				return getJndiQueueName();
			case EsbPackage.MESSAGE_STORE__CONNECTION_FACTORY:
				return getConnectionFactory();
			case EsbPackage.MESSAGE_STORE__USER_NAME:
				return getUserName();
			case EsbPackage.MESSAGE_STORE__PASSWORD:
				return getPassword();
			case EsbPackage.MESSAGE_STORE__JMS_SPEC_VERSION:
				return getJmsSpecVersion();
			case EsbPackage.MESSAGE_STORE__ENABLE_CACHING:
				return isEnableCaching();
			case EsbPackage.MESSAGE_STORE__PROVIDER_CLASS:
				return getProviderClass();
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_NAME:
				return getRabbitMQServerHostName();
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_PORT:
				return getRabbitMQServerHostPort();
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_QUEUE_NAME:
				return getRabbitMQQueueName();
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_EXCHANGE_NAME:
				return getRabbitMQExchangeName();
			case EsbPackage.MESSAGE_STORE__ROUTING_KEY:
				return getRoutingKey();
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_USER_NAME:
				return getRabbitMQUserName();
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_PASSWORD:
				return getRabbitMQPassword();
			case EsbPackage.MESSAGE_STORE__VIRTUAL_HOST:
				return getVirtualHost();
			case EsbPackage.MESSAGE_STORE__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EsbPackage.MESSAGE_STORE__STORE_NAME:
				setStoreName((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__STORE_TYPE:
				setStoreType((MessageStoreType)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__INITIAL_CONTEXT_FACTORY:
				setInitialContextFactory((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__PROVIDER_URL:
				setProviderURL((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__JNDI_QUEUE_NAME:
				setJndiQueueName((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__CONNECTION_FACTORY:
				setConnectionFactory((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__USER_NAME:
				setUserName((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__PASSWORD:
				setPassword((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__JMS_SPEC_VERSION:
				setJmsSpecVersion((JMSSpecVersion)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__ENABLE_CACHING:
				setEnableCaching((Boolean)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__PROVIDER_CLASS:
				setProviderClass((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_NAME:
				setRabbitMQServerHostName((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_PORT:
				setRabbitMQServerHostPort((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_QUEUE_NAME:
				setRabbitMQQueueName((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_EXCHANGE_NAME:
				setRabbitMQExchangeName((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__ROUTING_KEY:
				setRoutingKey((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_USER_NAME:
				setRabbitMQUserName((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_PASSWORD:
				setRabbitMQPassword((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__VIRTUAL_HOST:
				setVirtualHost((String)newValue);
				return;
			case EsbPackage.MESSAGE_STORE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MessageStoreParameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EsbPackage.MESSAGE_STORE__STORE_NAME:
				setStoreName(STORE_NAME_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__STORE_TYPE:
				setStoreType(STORE_TYPE_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__INITIAL_CONTEXT_FACTORY:
				setInitialContextFactory(INITIAL_CONTEXT_FACTORY_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__PROVIDER_URL:
				setProviderURL(PROVIDER_URL_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__JNDI_QUEUE_NAME:
				setJndiQueueName(JNDI_QUEUE_NAME_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__CONNECTION_FACTORY:
				setConnectionFactory(CONNECTION_FACTORY_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__JMS_SPEC_VERSION:
				setJmsSpecVersion(JMS_SPEC_VERSION_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__ENABLE_CACHING:
				setEnableCaching(ENABLE_CACHING_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__PROVIDER_CLASS:
				setProviderClass(PROVIDER_CLASS_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_NAME:
				setRabbitMQServerHostName(RABBIT_MQ_SERVER_HOST_NAME_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_PORT:
				setRabbitMQServerHostPort(RABBIT_MQ_SERVER_HOST_PORT_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_QUEUE_NAME:
				setRabbitMQQueueName(RABBIT_MQ_QUEUE_NAME_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_EXCHANGE_NAME:
				setRabbitMQExchangeName(RABBIT_MQ_EXCHANGE_NAME_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__ROUTING_KEY:
				setRoutingKey(ROUTING_KEY_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_USER_NAME:
				setRabbitMQUserName(RABBIT_MQ_USER_NAME_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_PASSWORD:
				setRabbitMQPassword(RABBIT_MQ_PASSWORD_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__VIRTUAL_HOST:
				setVirtualHost(VIRTUAL_HOST_EDEFAULT);
				return;
			case EsbPackage.MESSAGE_STORE__PARAMETERS:
				getParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EsbPackage.MESSAGE_STORE__STORE_NAME:
				return STORE_NAME_EDEFAULT == null ? storeName != null : !STORE_NAME_EDEFAULT.equals(storeName);
			case EsbPackage.MESSAGE_STORE__STORE_TYPE:
				return storeType != STORE_TYPE_EDEFAULT;
			case EsbPackage.MESSAGE_STORE__INITIAL_CONTEXT_FACTORY:
				return INITIAL_CONTEXT_FACTORY_EDEFAULT == null ? initialContextFactory != null : !INITIAL_CONTEXT_FACTORY_EDEFAULT.equals(initialContextFactory);
			case EsbPackage.MESSAGE_STORE__PROVIDER_URL:
				return PROVIDER_URL_EDEFAULT == null ? providerURL != null : !PROVIDER_URL_EDEFAULT.equals(providerURL);
			case EsbPackage.MESSAGE_STORE__JNDI_QUEUE_NAME:
				return JNDI_QUEUE_NAME_EDEFAULT == null ? jndiQueueName != null : !JNDI_QUEUE_NAME_EDEFAULT.equals(jndiQueueName);
			case EsbPackage.MESSAGE_STORE__CONNECTION_FACTORY:
				return CONNECTION_FACTORY_EDEFAULT == null ? connectionFactory != null : !CONNECTION_FACTORY_EDEFAULT.equals(connectionFactory);
			case EsbPackage.MESSAGE_STORE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case EsbPackage.MESSAGE_STORE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case EsbPackage.MESSAGE_STORE__JMS_SPEC_VERSION:
				return jmsSpecVersion != JMS_SPEC_VERSION_EDEFAULT;
			case EsbPackage.MESSAGE_STORE__ENABLE_CACHING:
				return enableCaching != ENABLE_CACHING_EDEFAULT;
			case EsbPackage.MESSAGE_STORE__PROVIDER_CLASS:
				return PROVIDER_CLASS_EDEFAULT == null ? providerClass != null : !PROVIDER_CLASS_EDEFAULT.equals(providerClass);
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_NAME:
				return RABBIT_MQ_SERVER_HOST_NAME_EDEFAULT == null ? rabbitMQServerHostName != null : !RABBIT_MQ_SERVER_HOST_NAME_EDEFAULT.equals(rabbitMQServerHostName);
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_SERVER_HOST_PORT:
				return RABBIT_MQ_SERVER_HOST_PORT_EDEFAULT == null ? rabbitMQServerHostPort != null : !RABBIT_MQ_SERVER_HOST_PORT_EDEFAULT.equals(rabbitMQServerHostPort);
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_QUEUE_NAME:
				return RABBIT_MQ_QUEUE_NAME_EDEFAULT == null ? rabbitMQQueueName != null : !RABBIT_MQ_QUEUE_NAME_EDEFAULT.equals(rabbitMQQueueName);
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_EXCHANGE_NAME:
				return RABBIT_MQ_EXCHANGE_NAME_EDEFAULT == null ? rabbitMQExchangeName != null : !RABBIT_MQ_EXCHANGE_NAME_EDEFAULT.equals(rabbitMQExchangeName);
			case EsbPackage.MESSAGE_STORE__ROUTING_KEY:
				return ROUTING_KEY_EDEFAULT == null ? routingKey != null : !ROUTING_KEY_EDEFAULT.equals(routingKey);
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_USER_NAME:
				return RABBIT_MQ_USER_NAME_EDEFAULT == null ? rabbitMQUserName != null : !RABBIT_MQ_USER_NAME_EDEFAULT.equals(rabbitMQUserName);
			case EsbPackage.MESSAGE_STORE__RABBIT_MQ_PASSWORD:
				return RABBIT_MQ_PASSWORD_EDEFAULT == null ? rabbitMQPassword != null : !RABBIT_MQ_PASSWORD_EDEFAULT.equals(rabbitMQPassword);
			case EsbPackage.MESSAGE_STORE__VIRTUAL_HOST:
				return VIRTUAL_HOST_EDEFAULT == null ? virtualHost != null : !VIRTUAL_HOST_EDEFAULT.equals(virtualHost);
			case EsbPackage.MESSAGE_STORE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (storeName: ");
		result.append(storeName);
		result.append(", storeType: ");
		result.append(storeType);
		result.append(", initialContextFactory: ");
		result.append(initialContextFactory);
		result.append(", providerURL: ");
		result.append(providerURL);
		result.append(", jndiQueueName: ");
		result.append(jndiQueueName);
		result.append(", connectionFactory: ");
		result.append(connectionFactory);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", jmsSpecVersion: ");
		result.append(jmsSpecVersion);
		result.append(", enableCaching: ");
		result.append(enableCaching);
		result.append(", providerClass: ");
		result.append(providerClass);
		result.append(", rabbitMQServerHostName: ");
		result.append(rabbitMQServerHostName);
		result.append(", rabbitMQServerHostPort: ");
		result.append(rabbitMQServerHostPort);
		result.append(", rabbitMQQueueName: ");
		result.append(rabbitMQQueueName);
		result.append(", rabbitMQExchangeName: ");
		result.append(rabbitMQExchangeName);
		result.append(", routingKey: ");
		result.append(routingKey);
		result.append(", rabbitMQUserName: ");
		result.append(rabbitMQUserName);
		result.append(", rabbitMQPassword: ");
		result.append(rabbitMQPassword);
		result.append(", virtualHost: ");
		result.append(virtualHost);
		result.append(')');
		return result.toString();
	}

} //MessageStoreImpl
